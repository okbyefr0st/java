package assignment;

import java.util.Scanner;

public class Validator {

	public static void main(String[] args) throws Exception {

		String email;
		Scanner t = new Scanner(System.in);
		System.out.println("Enter Email");

		email = t.next();
		System.out.println("Email :" + email);
		if (email.length() <= 10) {
			System.out.println("Wrong email1");
		} else {
			int a = email.indexOf('@');
			if (a < 3) {
				System.out.println("Wrong email //@wala size");
			} else {
				String e1 = email.substring(a + 1);
				if (e1.indexOf('@') > 0) {
					System.out.println("Wrong email2");
				} else {
					int b = e1.indexOf('.');
					if (b < 2) {
						System.out.println("Wrong //. wala size");
					} else {
						String e2 = e1.substring(b + 1);
						if (e2.indexOf('.') > 0) {
							System.out.println("Wrong email3");
						} else {
							{if (e2.length() <= 1) {
									System.out.println("Wrong Email//. ke aage ka size");
								} else {
									System.out.println(email + " is valid Email ID");
								}
							}
						}
					}

				}

			}

		}
	}
}
