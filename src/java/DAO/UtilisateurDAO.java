package DAO;
import MesBeans.UtilisateurBeans;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import metier.ConnectionBD;
import metier.IUtilisateurDAO;

public class UtilisateurDAO implements IUtilisateurDAO {
@Override
//Déclaration d’une fonction Authentification de type de retour String
public String authentification(UtilisateurBeans ub) {
    
     String userName = ub.getUserName();
     String passWord = ub.getPassword();
    try {
       //Création des paramètres de connexion à la BD
     Connection conn = ConnectionBD.getConnection();
     
     Statement ps = conn.createStatement();
     
     //Création de la requête et Récupérer tous les enregistrements et les stocker dans resultSet
     ResultSet rs = ps.executeQuery("SELECT * FROM `utilisateur`");
        
     //Déclaration des variables qui sert à récupérer les champs dans la BD
     String userNameDb = null;
     String passWordDb = null;
     while (rs.next()) {
     userNameDb = rs.getString("userName");
     passWordDb = rs.getString("Password");
     if (userNameDb.equals(userName) && passWordDb.equals(passWord)) {
     return "OK";}
      }
      } catch (Exception e) {
      e.printStackTrace();
      }
     return "KO";
}

@Override
public String ajouterUtilisateur(UtilisateurBeans ub) {
    String userName = ub.getUserName();
    String passWord = ub.getPassword();
    try { 
     Connection conn = ConnectionBD.getConnection();
     Statement ps = conn.createStatement();
     ps.executeUpdate("INSERT INTO `utilisateur`(`userName`, `Password`) VALUES ('"+userName+"','"+passWord+"')");
     return "OK";
     }catch (Exception e) {
      e.printStackTrace();
      System.out.println("exception");
      }
     return "KO";
}


}