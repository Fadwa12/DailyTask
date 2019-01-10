package com.dailyTask.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dailyTask.beans.UtilisateurOp;
import com.dailyTask.utility.Utilitaire;
import com.dailyTask.dao.DaoFactory;
import com.dailyTask.dao.UtilisateurDao;
import com.dailyTask.services.UtilisateurSvc;

/**
 * Servlet implementation class InscriptionController
 */
@WebServlet("/InscriptionController")
public class InscriptionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	
	
	
	
    public InscriptionController() {
    	
    	
    	
    	
    	
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname= request.getParameter("firstname");
		UtilisateurSvc utilisateurSvc =new UtilisateurSvc ();
		
		
		
		if (Utilitaire.verifLongeur(firstname))
		{		
		
		UtilisateurOp utilisateurOp =new UtilisateurOp();
		
		
		
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		utilisateurOp.setFirstname(firstname);
		utilisateurOp.setLastname(lastname);
		utilisateurOp.setEmail(email);
		utilisateurOp.setPassword(password);
		
		//utilisateurOp.setFirstname(firstname);
	//request.setAttribute("utilisateurOp", utilisateurOp);
		
		utilisateurSvc.ajouterUtilisateur(utilisateurOp); 
	
	}
   
		else {
			System.out.println("kkkk");
		}
		
		
		
		
		
		
		
		
		
		
		
		doGet(request, response);
	}
	
	
	
}


