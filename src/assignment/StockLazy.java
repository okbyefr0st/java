package assignment;

public class StockLazy {

	private static StockLazy obj;

	public static StockLazy getInstance() {
		if (obj == null) {
			obj = new StockLazy();
			//return obj;
		}
		return obj;
	}
		static StockLazy obj1 = new StockLazy();

		public static StockLazy getInstance1() {
			return obj1;
		}



	}

