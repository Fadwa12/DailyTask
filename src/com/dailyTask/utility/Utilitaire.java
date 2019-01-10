package com.dailyTask.utility;

public class Utilitaire {
	
	public static boolean  verifLongeur( String chaine) {
	
		if (chaine != null) {
			
		
		
		
                 if ((chaine.length() <2 )|| (chaine.length() >15)) {
		
		
		         return false;
		
	                     }
	
                  else {
	              return true;
                  }
		
		}
		
		
		
		
		


		else {
			return false;
		}
}
}