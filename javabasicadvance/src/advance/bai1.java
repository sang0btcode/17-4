package advance;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class MyThread implements Runnable {
	Boolean check = true;

	@Override
	public void run() {
		Random rd = new Random();
		Scanner scanner = new Scanner(System.in);
		try {
			FileWriter filewriter = new FileWriter("output.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(filewriter);

			while (check) {
				int soNguyenNgauNhien = rd.nextInt(100);
				bufferedWriter.write(String.valueOf(soNguyenNgauNhien));
				bufferedWriter.newLine();
				bufferedWriter.flush();
				Thread.sleep(1000);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void check(boolean b) {
		// TODO Auto-generated method stub
		this.check = b;
	}
}

public class bai1 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		MyThread myThread = new MyThread();
		Thread t = new Thread(myThread);
		t.start();
		System.out.println("Nhập 'STOP' để dừng ghi ");
		while (true) {
			String input = scanner.next();
			if (input.equals("STOP")) {
				myThread.check(false);
				System.out.println("Chương trình đã dừng lại");
			}
		}

	}
}
