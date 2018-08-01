
public class Book {

	public Book() {

	}

	static String bookname;
	static int count = 0;

	Book(String bookname) {
		this.bookname = bookname;
	}

	public void getMember() {
		if (count == 0)
			System.out.println("No book is issued");
		else
			System.out.println(Member.name + " taken " + bookname);
	}

	public void issueBook(Member m1) {
		System.out.println(bookname + " is issued to " + Member.name);
		count++;
	}

	public void returnBook(Member m1) {
		System.out.println(bookname + " is returned by " + Member.name);
		count--;
	}
}
