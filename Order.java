package onlineStore;

public class Order {
		private int orderNum;
		private double totalPrice = 0;
		private Product [] items = new Product [10];
		private int numOfOrders;
		
		Order( int orderNum, Product items)
		{
			this.orderNum = orderNum;
			this.items[numOfOrders] = items;
		}
		
	 public int getOrderNum()
		{
			return orderNum;
		}
	 public double getTotalPrice()
		{
		 	if(numOfOrders == 0)
		 	{
		 		totalPrice = items[numOfOrders].getUnitPrice();
		 	}
			return totalPrice;
		}
	 public String getItems()
	 {
		 return items[numOfOrders].getname() + " (No: "  +
				 items[numOfOrders].getProductNum() + "): $"
				 + items[numOfOrders].getUnitPrice();
	 }
}
