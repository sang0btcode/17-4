package Test1;

import java.util.Scanner;

public class Video56 {
	public static int nhapMasv() {

		int result;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập mã sv: ");
			try {
				result = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Mã số sv không hợp lệ, nhập vào sô nguyên");
				scanner.next();
				// TODO: handle exception
			}
		}
		scanner.close();
		return result;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int masv = nhapMasv();
			SinhVien sv = new SinhVien(masv, "Sang", 6.9, 25);
			System.out.println("sinh vien info =" + sv);
		}
	}
}
