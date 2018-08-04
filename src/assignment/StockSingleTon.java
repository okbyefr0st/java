package assignment;

public class StockSingleTon {
	
	

	public static void main(String[] args) {
		StockLazy a= StockLazy.getInstance();
		StockLazy b= StockLazy.getInstance();
		System.out.println(a);
		System.out.println(b);
	}

}
