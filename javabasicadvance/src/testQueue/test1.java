package testQueue;

import java.util.LinkedList;
import java.util.Queue;

public class HackHTML {
	public static void main(String[] args) {
		Queue<String> dsSV = new LinkedList<String>();
		dsSV.offer("TITV 1");
		dsSV.offer("Nguyen Van A");
		dsSV.offer("Nguyen Van B");
		dsSV.offer("TITV 2");
		while (true) {
			String ten = dsSV.peek();// pool lấy ra và xóa
			// peek: lấy ra nhưng không xóa
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}

	}

}
