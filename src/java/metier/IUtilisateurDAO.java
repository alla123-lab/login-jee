package metier;
import MesBeans.UtilisateurBeans;
public interface IUtilisateurDAO {
public String authentification(UtilisateurBeans ub);
public String ajouterUtilisateur(UtilisateurBeans ub);
}
