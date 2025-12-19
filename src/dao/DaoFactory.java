package dao;

import db.DB;
import impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){ 
        return new SellerDaoJDBC(DB.getConnection());
    } 
}
