package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() { 
		return new SellerDaoJDBC(DB.getConnection()); // the class will expose the method that return the type of the interface
	}								//  but internally she will instance a implementation
}	
// its a way to not expose the implementation and leave only the interface  