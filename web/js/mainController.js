/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$().ready(function(){
    $('#logoff').click(function(e){
        $.ajax({
            url: "../services/loginService.jsp",
            method: "POST",
            data: {method: 'Logoff'},
        }).done(function(){
            location.reload();
        })
    });
})
