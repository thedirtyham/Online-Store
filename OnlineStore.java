package onlineStore;
import java.text.DecimalFormat;
import java.util.Scanner;

public class OnlineStore {
		private String name;
		private Product [] products = new Product[10];
		private Order [] orders = new Order [10];
		private int numOfProducts = 0;
		private int numOfOrders = 0;
		private Scanner keyboard = new Scanner(System.in);
		
		OnlineStore(String name)
		{
			this.name = name;
		}
	
		void addProduct()
		{
			if (numOfProducts < 10){
				boolean fail = false;
				Scanner keyboard = new Scanner(System.in);
				int productNum;
				String name;
				double unitPrice;
				System.out.print("Product Numer: ");
				productNum = keyboard.nextInt();
				System.out.print("Product Name: ");
				keyboard.nextLine();
				name = keyboard.nextLine();
				System.out.print("Product Price: ");
				unitPrice = keyboard.nextDouble();
				keyboard.nextLine();
				for (int i = 0; i < numOfProducts; i++){
					if(products[i].getProductNum() == productNum){
						System.out.println("Sorry, " + productNum + 
								" already exists!");
						fail = true;
						break;
					}
				}
				if (!fail){
					DecimalFormat df = new DecimalFormat("0.00");
					products[numOfProducts] = new Product(productNum, name, unitPrice);
					System.out.println( "Product Added - " + products[numOfProducts].getname() + ", No: "
							+ products[numOfProducts].getProductNum() + ", Price: " + 
							df.format(products[numOfProducts].getUnitPrice()));
					numOfProducts++;
				}
			}
			else{
				System.out.println("You already have 10 products");
			}
			}
		
		void productInfo()
		{
			int counter = 1;
			DecimalFormat df = new DecimalFormat("0.00");
			if(numOfProducts == 0)
			{
				System.out.println("There is no products. ");
			}
			for(int i = 0; i < numOfProducts; i ++)
			{
			System.out.println(counter + ". " + products[i].getname() + " (No. " +
						products[i].getProductNum() + "): $" + 
						df.format(products[i].getUnitPrice()));
			counter++;
			}
		}
		void makeOrder()
		{
			int orderNumber;
			int productNum;
			int counter = 1;
			if(numOfProducts == 0)
			{
				System.out.println("No items to be ordered.");
			}
			System.out.print("Order NUmber: ");
			orderNumber = keyboard.nextInt();
			for(int i = 0; i < numOfProducts; i++)
			{
				System.out.print("Type Product Number (0 to finish) : ");
				productNum = keyboard.nextInt();
				if(products[i].getProductNum() == productNum)
				{
					orders[numOfOrders] = new Order(orderNumber, products[i]);
					numOfOrders++;
				}
				else
				System.out.println("Error: Product " + productNum + 
						" does not exist.");
			}
			System.out.println("Order Info - Order Number: " + orderNumber);
			for(int i = 0; i < numOfOrders; i++)
			{
				System.out.println("Item " + counter + ": " + orders[i].getItems());
				counter++;
			}
			System.out.println("Total Price: " + orders[numOfOrders].getTotalPrice());
		}
		
		}
