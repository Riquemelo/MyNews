/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function checkNextButton(){
    var nome = $('#register-nome').val();
    var dt_nasc = $('#register-dataNasc').val();
    var email = $('#register-email').val();
    var password = $('#register-pass').val();
    
    if(nome != '' && dt_nasc != '' && email != '' && password != '' && password.length >= 5){
        console.log('ativei');
        $('#next-button').removeAttr('disabled');
    }else{
        console.log('desativei');
        $('#next-button').prop('disabled', true);
    }
}

$().ready(function() {
    $('#login-button').click(function(e) {
        e.preventDefault();
        var user = $('#user-input').val();
        var pass = $('#pass-input').val();
        
        $.ajax({
            url: "./services/loginService.jsp",
            method: "POST",
            data: {method: 'Login', user: user, pass: pass},
            dataType: "JSON"
        }).done(function (obj){
           if(obj.success){
               location.reload();
           }else{
               if(obj.stacktrace == 'invalid'){
                   alert('Login e/ou senha incorretos');
               }else{
                   console.error('Erro ao logar', obj.errorMessage);
               }
           }
        }).fail(function (){
            alert("Error")
        })
    });
    
    $('#register-button').click(function(e){
       $('#login-box').hide();
       $('#register-box').show();
    });
    
    $('#back-button').click(function(e){
       $('#register-box').hide();
       $('#login-box').show();
       
    })
    
    $('#next-button').click(function(e){
        e.preventDefault();
        $('#form-box').hide();
        $('#question-box').show();
    });
    
    $('.register-field').keyup(function(){
        checkNextButton();
    });
});
