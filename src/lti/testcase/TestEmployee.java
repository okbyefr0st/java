package lti.testcase;
import lti.person.Employee;
import lti.person.Executive;
import lti.person.Manager;

public class TestEmployee {

	public static void main(String[] args) {
//		Employee e1 = new Employee("Abhishek", 25632);
//		e1.paySlip();

		Manager mgr = new Manager("Ragini", 51264, 2000);
		// mgr.paySlip();
		showSalary(mgr);
		Executive exec = new Executive("Lad", 52000, 6256);
		// exec.paySlip();
		showSalary(exec);

	}

	private static void showSalary(Employee e1) {
		if (e1 instanceof Manager)
			System.out.println("Manager Salary :" + e1.getSalary());
		else
			System.out.println("Executive Salary :" + e1.getSalary());

	}

	// private static void showSalary(Executive exec) {
	// System.out.println("Executive Salary :" + exec.getSalary());
	// }
	//
	// private static void showSalary(Manager mgr) {
	// System.out.println("Manager Salary :" + mgr.getSalary());
	//
	// }

}
