package com.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Utilisateur;
import com.metier.IUtilisateurMetier;
import com.metier.UtilisateurMetier;

@WebServlet("/users/save")
public class RegisterServletExc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final IUtilisateurMetier utilisateurMetier = new UtilisateurMetier();
    public RegisterServletExc() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom =  request.getParameter("lastName");
		String prenom =  request.getParameter("firstName");
		String email =  request.getParameter("email");
		String password =  request.getParameter("password");
		Utilisateur user = new Utilisateur(nom,prenom,email,password);
		System.out.println(user.getNom());
		utilisateurMetier.create(user);
		response.sendRedirect(getServletContext().getContextPath()+"/login");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
