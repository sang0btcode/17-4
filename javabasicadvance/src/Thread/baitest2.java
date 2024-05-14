package Thread;

class Thread_Priority implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

public class baitest2 {
	public static void main(String[] args) {
		Thread_Priority thread1 = new Thread_Priority();
		Thread m1 = new Thread(thread1);
		Thread m2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("running thread 2 name is" + Thread.currentThread().getName());
				System.out.println("running thread 2 priority is " + Thread.currentThread().getPriority());
			}
		});
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}
}