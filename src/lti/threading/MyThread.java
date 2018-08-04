package lti.threading;

public class MyThread extends Thread {
	private int data;

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		String name = currentThread().getName();

		 for (int i = 1; i <= 10; i++)
		 System.out.println(++data +"\t"+name);

	}

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("First");
		MyThread mt2 = new MyThread("Second");
		MyThread mt3 = new MyThread("Three");

		mt1.start();
		mt2.start();
		mt3.start();

		String name = currentThread().getName();
		for (int i = 1; i <= 10; i++)
			System.out.println(i +"\t"+name);
	

	}
}
