package Thread;

class Counter {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}

}

public class baiTap1 {
	public static void main(String[] args) {
		System.out.println("1");
		Counter counter = new Counter();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("giá trị chạy t1 " + i);
					counter.increment();
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("giá trị chạy t2 " + i);
					counter.increment();
				}

			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Giá trị cuối cùng " + counter.getCount());
	}
}
