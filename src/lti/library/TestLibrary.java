package lti.library;

public class TestLibrary {

	public static void main(String[] args) {
		Book alc = new Book("The Alchemist");
		Member mbr = new Member("Ragini");
		
		alc.issueBook();
		alc.memberDetails();
		
	}

}
