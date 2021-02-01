package Service;
import bean.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ProductService {
public static int id;
public String name;
public int price;
int size;
Product[] product=new Product[10];
Scanner sc=new Scanner(System.in);
ArrayList<Product >p=new ArrayList<Product>();
public void add(int id,String name,int price)
{

	p.add(new Product(id,name,price));

}


public void update(int num,int price)
{
	for(int i=0;i<p.size();i++)
	{
		Product pp = p.get(i);
		if(pp.getId()==num)
		{
			pp.setPrice(price);

		}
	}
}
public void delete(int id)
{
	for(Product pp : p)
	{
		 if(pp.getId()==id)
		 {
			 p.remove(pp);
			 break;
		 }
	}


}
public ArrayList<Product>display(){
	return p;
}
public int retrieve(int id)
{
	int temp=0;
	for(Product pp : p)
	{
		 if(pp.getId()==id)
		 {
			 temp = pp.getPrice();
			 break;
		 }
	}
	return temp;


}

}