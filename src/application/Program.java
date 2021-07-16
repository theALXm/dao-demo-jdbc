package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;

public class Program 
{

	public static void main(String[] args) 
	{
		Department obj = new Department(1, "books");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
				
		System.out.println(obj);
		System.out.println(sellerDao);
	}
}
