package com.presentation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entities.Utilisateur;
import com.metier.IUtilisateurMetier;
import com.metier.UtilisateurMetier;

/**
 * Servlet implementation class LoginServletExc
 */
@WebServlet("/LoginServletExc")
public class LoginServletExc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final IUtilisateurMetier utilisateurMetier = new UtilisateurMetier();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletExc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("email");
        String pwd = request.getParameter("password");
        Utilisateur user = new Utilisateur();
        user.setPassword(pwd);
        user.setEmail(login);
        Utilisateur u =  utilisateurMetier.login(user);
        if(u == null) {
        	System.out.println("probleme ici");
            response.sendRedirect(getServletContext().getContextPath()+"/login");
        }else {
        	HttpSession httpSession = request.getSession();
            httpSession.setAttribute("user",user);
            response.sendRedirect(getServletContext().getContextPath());
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
