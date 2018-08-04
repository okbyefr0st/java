package assignment;

public class Member {
	public Member()
	{
		
	}
	
	static String name;
	Member(String name)
	{
		this.name=name;
	}
	public void getbook()
	{
		if(Book.count==0)
			System.out.println("No Book is issued");
		else 
			System.out.println("Book issued is "+Book.bookname);
	}


}
