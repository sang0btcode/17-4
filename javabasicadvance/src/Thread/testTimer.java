package Thread;

import java.util.Timer;
import java.util.TimerTask;

public class testTimer {
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Hẹn giờ đã hết");

			}
		};
		timer.schedule(task, 5000);// lịch thực thi task sau 5s

	}
}
