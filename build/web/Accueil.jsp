<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String message = (String)request.getAttribute("message");%>

<html>
    <head>
        <title>acceuil</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <p> Bonjour ${UserConnected}</p>
        <div><%=message%></div>
        <a href="CreerUtilisateur.jsp" >Créer un utilisateur</a>
        <a href="Deconnexion" >Déconnexion</a>
        
    </body>
</html> 
