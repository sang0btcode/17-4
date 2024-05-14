package testQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class testDeque {
	public static void main(String[] args) {
		Deque<String> dsSV = new ArrayDeque<String>();
		dsSV.offer("TITV 1");
		dsSV.offer("Nguyen Van B");
		dsSV.offer("Nguyen Van A");
		dsSV.offer("TITV 2");
		dsSV.offerLast("TITV 4");
		dsSV.offerFirst("TITV 0");

//	TITV4 > TITV 2 > Nguyen Van A > Nguyen Van B > TITV 1 > TITV 0
		while (true) {
			String ten = dsSV.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
