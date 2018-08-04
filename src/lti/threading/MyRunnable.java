package lti.threading;

public class MyRunnable implements Runnable {
	private int data;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		for (int i = 1; i <= 50; i++)
			System.out.println(++data + "\t" + name);

	}

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "First");
		Thread t2 = new Thread(mr, "Second");
		Thread t3 = new Thread(mr, "Three");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
