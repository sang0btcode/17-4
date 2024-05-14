package Thread;

public class testDeadlock {
	public static void main(String[] args) {
		final String hung = "Hung";// tài nguyên A
		final String lan = "Lan";// tài nguyên B
		Thread t1 = new Thread() {
			public void run() {
				synchronized (hung) {
					System.out.println("Đến nhà rủ Lan đi chơi");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					synchronized (lan) {
						System.out.println("Đi chơi");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (lan) {
					System.out.println("Đến nhà hùng hỏi bài");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					synchronized (hung) {
						System.out.println("hoc bai");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
