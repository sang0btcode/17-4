package Thread;

import java.util.Timer;
import java.util.TimerTask;

public class testSchedule {
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("hẹn giờ đã hết");
			}
		};
		timer.scheduleAtFixedRate(task, 5000, 2000);// sau 5s thực thi lặp lại mỗi 2s
	}
}
