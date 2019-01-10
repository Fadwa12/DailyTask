package com.dailyTask.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dailyTask.beans.UtilisateurOp;
import com.dailyTask.dao.DaoFactory;

public class UtilisateurDaoImpl  implements UtilisateurDao{

	  private DaoFactory daoFactory;

	    UtilisateurDaoImpl(DaoFactory daoFactory) {
	        this.daoFactory = daoFactory;
	    }
	@Override
	public void ajout(UtilisateurOp utilisateurOp) {
		// TODO Auto-generated method stub
		
		 Connection connexion = null;
	        PreparedStatement preparedStatement = null;


	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = connexion.prepareStatement("INSERT INTO utilisateur(username,lastname,email,password) VALUES(?, ?,?,?);");
	            preparedStatement.setString(1, utilisateurOp.getFirstname());
	            preparedStatement.setString(2, utilisateurOp.getLastname());
	            preparedStatement.setString(3, utilisateurOp.getEmail());
	            preparedStatement.setString(4, utilisateurOp.getPassword());
	           
	            
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

		
		
		
	}

}
