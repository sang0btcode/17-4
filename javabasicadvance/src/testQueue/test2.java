package testQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class test2 {
	public static void main(String[] args) {
		Queue<String> dsSV = new PriorityQueue<>();
		dsSV.offer("TITV 1");
		dsSV.offer("Nguyen Van B");
		dsSV.offer("Nguyen Van A");
		dsSV.offer("TITV 2");

		while (true) {
			String ten = dsSV.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
