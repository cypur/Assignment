package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import Service.*;
import bean.Product;

public class ProductOperation{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int ch,size;
		int id;
		String name;
		int price;
		int j;
		boolean flag=true;
		System.out.println("Enter no of products");
		size=sc.nextInt();
		ProductService pt=new ProductService();
		ArrayList<Product>p=new ArrayList<Product>();
		    do
			{
				System.out.println("Enter your option:");
				System.out.println("1. Add");
				System.out.println("2. update");
				System.out.println("3. delete");
				System.out.println("4. display");
				System.out.println("5. retrive");
				ch=sc.nextInt();
			switch (ch)
			{  
			case 1:
				System.out.println("1. Add");
				for(int i=0;i<size;i++)
				{
					System.out.println("Enter the pid");
					id=sc.nextInt();
					System.out.println("Enter the pname");
					sc.nextLine();
					name=sc.nextLine();
					System.out.println("Enter the price");
					price=sc.nextInt();
					pt.add(id, name, price);
					System.out.println();

					}

				break;
			case 2:
				System.out.println("2. update");
				System.out.println("Enter the pid");
				id=sc.nextInt();
				name=sc.nextLine();
				System.out.println("Enter the price");
				price=sc.nextInt();
				pt.update(id, price);

				System.out.println();
				break;
			case 3:
				System.out.println("3. delete");
				System.out.println("Enter the pid");
				id=sc.nextInt();
				pt.delete(id);
				System.out.println("Product Deleted "+id);
				break;
			case 4:
				System.out.println("4.display");
				p=pt.display();
				for(Product a:p) {
					System.out.println("id and name and price"+a);
				}

				System.out.println();
				break;
			case 5:
				System.out.println("5.retrive");
				System.out.println("Enter the pid");
				id=sc.nextInt();
				int temp = pt.retrieve(id);
				System.out.println(" The price " +temp);
				System.out.println(pt);
				break;

		   default:
			   System.out.println("Invalid  option:");


			}



			}while(flag);




	}
}