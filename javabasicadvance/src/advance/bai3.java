package advance;

import java.util.LinkedList;
import java.util.Queue;

public class bai3 {
	private static final int MAX_QUEUE_SIZE = 5; // Kích thước tối đa của message queue

	public static void main(String[] args) {
		Queue<String> messageQueue = new LinkedList<>(); // Message queue

		// Producer thread
		Thread producerThread = new Thread(() -> {
			int messageCount = 1;
			while (true) {
				try {
					synchronized (messageQueue) {
						// Nếu queue đầy, đợi cho đến khi có chỗ trống
						while (messageQueue.size() == MAX_QUEUE_SIZE) {
							System.out.println("Message queue is full. Waiting...");
							messageQueue.wait();
						}
						String message = "Message " + messageCount++;
						messageQueue.add(message);
						System.out.println("Produced: " + message);
						messageQueue.notifyAll(); // Thông báo cho các consumer thread
					}
					Thread.sleep(1000); // Đợi 1 giây trước khi tạo message mới
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Consumer thread
		Thread consumerThread = new Thread(() -> {
			while (true) {
				try {
					synchronized (messageQueue) {
						// Nếu queue trống, đợi cho đến khi có message
						while (messageQueue.isEmpty()) {
							System.out.println("Message queue is empty. Waiting...");
							messageQueue.wait();
						}
						String message = messageQueue.poll();
						System.out.println("Consumed: " + message);
						messageQueue.notifyAll(); // Thông báo cho các producer thread
					}
					Thread.sleep(2000); // Đợi 2 giây trước khi lấy message tiếp theo
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producerThread.start();
		consumerThread.start();
	}
}
