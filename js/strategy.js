var Validator = function (options) {
  var field;
  var fields = options.fields;
  var validations = options.validations;

  this.errors = [];

  this.hasErrors = function() {
    return this.errors.length !== 0;
  };

  this.validate = function (fieldName) {
    var type = validations[fieldName];
    var method = this.types[type];
    var value = fields[fieldName];

    if (!method(value)) {
      this.errors.push('Invalid value for '
        + fieldName);
    };
  };

  for (field in fields) {
    this.validate(field);
  }
};

Validator.prototype.types = {
  isNonEmpty: function(value) {
    return value !== "";
  }
};

// --

var validator = new Validator({
  fields: {
    firstName: ''
  },
  validations: {
    firstName: 'isNonEmpty'
  }
});

console.log(validator.hasErrors());
// => true

console.log(validator.errors);
// => ['Invalid value for firstName']