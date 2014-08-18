var modal = new Modal();

modal.message = 'Seus dados foram 
  atualizados com sucesso!';

TopButtons(modal); 
SuccessModal(modal);

modal.show();

// --

var modal = new Modal();

modal.message = 'Ocorreu um erro
  durante a atualização! :O';

TopButtons(modal); 
ErrorModal(modal);

modal.show();

// -- 

var TopButtons = function (modal) {
  modal.showTopButtons = true;

  modal.close = function () {
    // ...
  };
  modal.maximize = function () {
    // ...
  };
  modal.minimize = function () {
    // ...
  };
};
