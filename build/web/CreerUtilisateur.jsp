<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>acceuil</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <p> Bonjour ${UserConnected}</p>
        <form action="AjouterUtilisateur" method="post">
       
                
            <div>ajouter L'Utilisateur  </div>
            <div style="color:red;" >${ message }</div>
            <table>
                <tr>
                    <td>username : </td>
                    <td><input type='text'  name='username'   ></td>
                </tr>
                <tr>
                    <td>password : </td> 
                    <td> <input type='text'  name='password'  ></td>
                </tr>
              
                <tr>  
                    <td><INPUT type="submit" value="ajouter"> </td>
                </tr>
                
            </table>
  
        </form>
        <a href="Accueil.jsp" >return</a>
        <a href="Deconnexion" >Déconnexion</a>
        
    </body>
</html> 
