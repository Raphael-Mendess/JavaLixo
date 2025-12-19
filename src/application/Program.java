package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");       
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(obj);
        System.out.println(seller);
    }
}
