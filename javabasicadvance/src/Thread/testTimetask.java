package Thread;

import java.util.Timer;
import java.util.TimerTask;

class Mytimertask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Hẹn giờ đã hết");
	}
}

public class testTimetask {
	public static void main(String[] args) {
		Timer timer = new Timer();
		Mytimertask task = new Mytimertask();
		timer.schedule(task, 5000);// lịch thực thi sau 5s
	}
}
