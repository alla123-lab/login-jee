package MesServlet;

import DAO.UtilisateurDAO;
import MesBeans.UtilisateurBeans;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AjouterUtilisateur extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               HttpSession se = request.getSession();
               String message ="";
                String NomUtilsateur = request.getParameter("username");
                String MotDePasse = request.getParameter("password");
               if(NomUtilsateur.equals("") || MotDePasse.equals("")){
                //Si les champs csont vide alors on redirige versla page Identfication.jsp
                 message = "il doit remplir les champs";
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/Accueil.jsp").forward(request,response);
               }else{
                  //Création d’un objet bean de type UtilisateurBeans
                  UtilisateurBeans ub = new UtilisateurBeans();
        
                   ub.setUserName(NomUtilsateur);
                   ub.setPassword(MotDePasse);
                   //Création de l’objet UtilisateurDAO. Cette classe contient la logique de notre application
                   UtilisateurDAO ud = new UtilisateurDAO();
                   //Appel à la fonction Authentification dans la classe UtilisateurDAO
                   String result = ud.ajouterUtilisateur(ub);
                  if (result.equals("OK")) {
                      message = "l'utilisateur est bien atoujter ";
                      request.setAttribute("message",message);
                      getServletContext().getRequestDispatcher("/Accueil.jsp").forward(request,response);
                  } else {
                      //Si la fonction renvoie autre que la chaine Ok alors on redirige versla page Identfication.jsp
                      message = "Nom d'utilisateur estr deja existe";
                     request.setAttribute("message", message);
                     getServletContext().getRequestDispatcher("/Accueil.jsp").forward(request,response);
}
 } 
    }

}
