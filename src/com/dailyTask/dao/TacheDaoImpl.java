package com.dailyTask.dao;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dailyTask.beans.TacheOp;

public class TacheDaoImpl implements TacheDao {

	private DaoFactory daoFactory;
	
	
	
	public TacheDaoImpl(DaoFactory daoFactory) {
		super();
		this.daoFactory = daoFactory;
	}



	@Override
	public void ajout(TacheOp tacheOp) {
		// TODO Auto-generated method stub
		
		 Connection connexion = null;
	        PreparedStatement preparedStatement = null;
		 
	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = connexion.prepareStatement("INSERT INTO tache(nom,description) VALUES(?,?);");
	            preparedStatement.setString(1, tacheOp.getNom());
	          
	            preparedStatement.setString(2, tacheOp.getDescription());
	        
	            
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        
	        
		
		
	}

}
