<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String message = (String)request.getAttribute("message");%>
<html>
    <head>
        <title>login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="Identification" method="post">
       
                
            <div>Formulaire de connixion  </div>
            <div style="color:red;" >${ message }</div>
          <table>
                <tr>
                    <td>Login : </td>
                    <td><input type='text'  name='username'   ></td>
                </tr>
                <tr>
                    <td>password : </td> 
                    <td> <input type='text'  name='password'  ></td>
                </tr>
              
                <tr>  
                    <td><INPUT type="submit" value="Login"> </td>
                </tr>
                
            </table>
  
        </form>
    </body>
</html> 