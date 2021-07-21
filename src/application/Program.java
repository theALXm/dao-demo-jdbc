package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program 
{

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
				
		System.out.println("=====teste 1: find by id=====");
		System.out.print("insert id: ");
		int n = sc.nextInt();
		Seller seller = sellerDao.findById(n);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("=====teste 2: find by department=====");
		System.out.print("insert department: ");
		n = sc.nextInt();
		Department department = new Department(n, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list)
		{
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=====teste 3: find all=====");
		list = sellerDao.findAll();
		for(Seller obj: list)
		{
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=====teste 4: insert=====");
		Seller newSeller = new Seller(null, "pedro", "pedro@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("new id: " + newSeller.getId());
		
		
		
		sc.close();
	}
}
