package com.dailyTask.services;

import com.dailyTask.beans.TacheOp;
import com.dailyTask.dao.DaoFactory;
import com.dailyTask.dao.TacheDao;

public class TacheSvc {

	
	
	
	
	TacheDao tacheDao;
	
	
	
	public void ajouterTache(TacheOp tacheOp) {
		
		DaoFactory daoFactory = DaoFactory.getInstance();
	
		this.tacheDao= daoFactory.getTacheDao();
		tacheDao.ajout(tacheOp);
	}
}
