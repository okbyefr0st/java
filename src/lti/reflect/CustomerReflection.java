package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class CustomerReflection {

	public static void main(String[] args) {

		Customer c1 = new Customer("Polo");
		System.out.println(c1);

		Class cc = c1.getClass();
		System.out.println(cc);

		System.out.println("--List of constructuor--");
		Constructor[] constructors = cc.getConstructors();
		for (Constructor c : constructors)
			System.out.println(c);
	
		System.out.println("--List of Methods--");
		Method[] decmethods = cc.getDeclaredMethods();
		for (Method m : decmethods)
			System.out.println(m);
	 
		System.out.println("--List of Fields");
		java.lang.reflect.Field[] fields = cc.getDeclaredFields();
		for(java.lang.reflect.Field f : fields) {
			System.out.println(f);
			
			// c1.print();
		}
	}

}
