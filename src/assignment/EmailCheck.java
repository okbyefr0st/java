
package assignment;

import java.util.Scanner;

public class EmailCheck {

	

	public static void main(String[] args) {
		int l, m, n,a,b,c,d;
		String email;
		Scanner t = new Scanner(System.in);
		System.out.println("Enter Email");

		email = t.next();
		System.out.println("Email :" + email);

		a = email.indexOf('@');
		b = email.lastIndexOf('@');

		c = email.indexOf('.');
		d = email.lastIndexOf('.');

		if (a != b && c != d) 
			System.out.println("Invalid Email....double @ and .");

		else {
			String x = email.substring(0, a - 1);
			String y = email.substring(a + 1, c - 1);
			String z = email.substring(c + 1, email.length() - 1);

			l=x.length();
			m=y.length();
			n=z.length();
		
			if (l <= 4 && m <= 3 && n <= 2)

				System.out.println(email + " is valid EmailID");

		}
	}
}

// abhisheklad@gmail.com
