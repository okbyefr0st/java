
public class Stock implements Exchange {


	@Override
	public void viewQuote() {
		System.out.println("Viewing stock quote");
	}

	@Override
	public void getQuote() {
		System.out.println("Geting stock quote");

	}

	@Override
	public void setQuote() {
		System.out.println("Seting stock quote");

	}

	}
