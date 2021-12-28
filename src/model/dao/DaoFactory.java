package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao creatSelleDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
