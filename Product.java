package onlineStore;

public class Product {
		private int productNum;
		private String name;
		private double unitPrice;
		
		Product(int productNum, String name, double unitPrice)
		{
			this.productNum = productNum;
			this.name =name;
			this.unitPrice = unitPrice;
		}
		
		public int getProductNum()
		{
			return productNum;
		}
		
		public String getname()
		{
			return name;
		}
		
		public double getUnitPrice()
		{
			return unitPrice;
		}
}
