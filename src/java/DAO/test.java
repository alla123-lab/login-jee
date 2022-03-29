
package DAO;

import MesBeans.UtilisateurBeans;

public class test {
    public static void main(String[] args) {
    
    UtilisateurDAO x = new UtilisateurDAO();
   UtilisateurBeans ub = new UtilisateurBeans();
    ub.setUserName("amed");
    ub.setPassword("12345");
    System.out.println(x.authentification(ub));
    
    /*tester de identification
    UtilisateurBeans y = new UtilisateurBeans();
    y.setUserName("admin");
    y.setPassword("admin");
    System.out.println(x.authentification(y));
    */
}}