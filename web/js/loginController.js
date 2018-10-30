/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$().ready(function() {
    $('#login-button').click(function(e) {
        console.log('click');
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
    })
});
