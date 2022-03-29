package MesServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name = "Deconnexion", urlPatterns = {"/Deconnexion"})
public class Deconnexion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Récupération des paramètres   
        HttpSession se = request.getSession();
        se.invalidate();
        getServletContext().getRequestDispatcher("/identification.jsp").forward(request, response);

    }
}
