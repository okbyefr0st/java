package lti.person;

public class Manager extends Employee {

	private double comission;

	public Manager() {

	}

	public Manager(String empName, double salary, double comission) {
		super(empName, salary);
		this.comission = comission;
	}

	@Override
	public void paySlip() {
		super.paySlip();
		System.out.println("comission :" + comission);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + comission;
	}
}
