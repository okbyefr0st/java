package assignment;

import java.util.Scanner;

public class EmailValid {

	public static void main(String[] args) {
		int l, m, n, a, b, c, d;
		// String x, y, z;
		String email;
		Scanner t = new Scanner(System.in);
		System.out.println("Enter Email");

		email = t.nextLine();
		System.out.println("Email :" + email);

		a = email.indexOf('@');
		b = email.lastIndexOf('@');

		c = email.indexOf('.');
		d = email.lastIndexOf('.');
		int r = email.length();
		String x = email.substring(0, (a - 1));
		String y = email.substring((a + 1), (c - 1));
		String z = email.substring((c + 1), (r - 1));

		if (a == b && c == d && r > 10 && d-a-1>2 && r-1-c>1) {
			System.out.println(email+" is valid email");
					} else {
			System.out.println(email + " is Invalid EmailID");
		}

	}
}

// abhisheklad@gmail.com
