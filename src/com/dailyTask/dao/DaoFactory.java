package com.dailyTask.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.dailyTask.dao.UtilisateurDao;
import com.dailyTask.dao.UtilisateurDaoImpl;

public class DaoFactory {

	//variables de connexion a la bd
	 private String url;
	    private String username;
	    private String password;
	
	    
	    //constructeur
	    DaoFactory(String url, String username, String password) {
	        this.url = url;
	        this.username = username;
	        this.password = password;
	    }
	
	
	    public static DaoFactory getInstance() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {

	        }

	        DaoFactory instance = new DaoFactory(
	        		"jdbc:mysql://localhost:3306/task?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
	       
	        System.out.println("connecte");
	        return instance;
	        
	    }
	    
	    
	    
	    
	    public Connection getConnection() throws SQLException {
	    	
	    	
	        return DriverManager.getConnection(url, username, password);
	    }
	    
	    public UtilisateurDao getUtilisateurDao() {
	        return new UtilisateurDaoImpl(this);
	    }
	    
	    
}
