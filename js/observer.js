var Context = function() {
  this.modals = [];

  this.updateAll = function(msg){
    this.notify(msg);
  };

  this.notify = function(msg) {
    var i = 0;
    for (; i < this.modals.length; i++) {
      this.modals[i].update(msg);
    }
  };

};

var Modal = function() {

  this.update = function(msg) {
    if (msg == 'close') {
      this.close();
    }
  };

  this.close = function(){  
    console.log('Popup fechada!');  
  };

};

// --

var context = new Context();

var modal1 = new Modal();
var modal2 = new Modal();
var modal3 = new Modal();

context.modals.push(modal1);
context.modals.push(modal2);
context.modals.push(modal3);

context.updateAll('close');
// Popup fechada!
// Popup fechada!
// Popup fechada!