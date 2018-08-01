
public class Test {

	public static void main(String[] args) {
		Member m1 = new Member("John");
		Book b1= new Book("The Alchemist");
		m1.getbook();
		b1.issueBook(m1);
		b1.getMember();
		m1.getbook();
		b1.returnBook(m1);
		b1.getMember();
	}

}
