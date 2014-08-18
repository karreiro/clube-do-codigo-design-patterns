var _ = require('underscore');

var Modal = function (options) {
  var default = {
    buttons: true,
    overlay: true,
    onClose: function () {}
  };
  return MyLib.modal(_.extend(options, default));
};

var ModalFactory = function (type) {
  if (typeof this[type] !== 'function') {
    throw 'NotImplementedError';
  }
  return this[type]();
};

ModalFactory.prototype.alert = function () {
  return new Modal({
    width: 100,
    height: 70,
    theme: 'alert-modal'
  });
};

ModalFactory.prototype.form = function () {
  return new Modal({
    width: 400,
    height: 300,
    theme: 'form-modal'
  });
};

// --

new ModalFactory('form');
new ModalFactory('alert');
new ModalFactory('form');
