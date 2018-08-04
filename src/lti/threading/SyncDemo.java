package lti.threading;

public class SyncDemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		display(name);
	}
	private Object dummy= new Object();
	private void display(String name) {
		System.out.println("Thread Entered");
		synchronized (dummy) {
		System.out.print("[");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
		}
		System.out.println("Thread Exits");

	}

	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		Thread t1 = new Thread(sd, "Alpha");
		Thread t2 = new Thread(sd, "Bravo");
		Thread t3 = new Thread(sd, "Charlie");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
