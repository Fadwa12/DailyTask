package com.dailyTask.services;

import javax.servlet.ServletException;

import com.dailyTask.beans.UtilisateurOp;
import com.dailyTask.dao.DaoFactory;
import com.dailyTask.dao.UtilisateurDao;

public class UtilisateurSvc {

	

	
	
	
	
	


	
	
	
	

	UtilisateurDao utilisateurDao;
	
	
	
	
	
	
	public void ajouterUtilisateur(UtilisateurOp utilisateurOp ) {
		
		DaoFactory daoFactory = DaoFactory.getInstance();
        this.utilisateurDao = daoFactory.getUtilisateurDao();
		utilisateurDao.ajout(utilisateurOp);
		
		
	}
	
	
}
