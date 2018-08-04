package lti.person;

public abstract class Employee {

	private int empNo;
	private String empName;
	private double salary;

	private static int autogen;

	static {
		System.out.println("Class is loaded...");
		autogen = 1001;
	}

	public Employee() {

	}

	public Employee(String empName, double salary) {
		this.empNo = autogen ++;
		this.empName = empName;
		this.salary = salary;
	}

	public void paySlip() {
		System.out.println("EMPNO :" + empNo);
		System.out.println("EMPNAME :" + empName);
		System.out.println("SALARY :" + salary);
	}

	public double getSalary() {
		return salary;
	}
}
