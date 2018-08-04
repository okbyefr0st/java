package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {

	public static void main(String[] args) throws Exception {
		String qcn = "lti.reflect.Customer";

		/// manaually loading the class
		Class custClass = Class.forName(qcn);
		// getting with param constructor
		Constructor custConst = custClass.getConstructor(String.class);
		// Instiating with param constructor
		Object obj = custConst.newInstance("Abhishek");
		System.out.println(obj);
		// Getting private method of class
		Method printMethod = custClass.getDeclaredMethod("print", null);
		// calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);

	}

}
