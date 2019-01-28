package com.dailyTask.controllers;
import java.util.Date;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dailyTask.beans.TacheOp;
import com.dailyTask.services.TacheSvc;
import com.dailyTask.utility.FormatDate;

/**
 * Servlet implementation class TacheController
 */
@WebServlet("/TacheController")
public class TacheController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TacheController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/tache.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		TacheOp tacheOp= new TacheOp();
		TacheSvc tacheSvc= new TacheSvc();
		
		
		
		
		tacheOp.setNom(request.getParameter("nom"));
		
		tacheOp.setDescription(request.getParameter("description"));
		
		
		
	    tacheSvc.ajouterTache(tacheOp);
		
		
		
		
		
		doGet(request, response);
	}

}
