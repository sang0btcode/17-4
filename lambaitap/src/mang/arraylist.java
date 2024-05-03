package mang;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//viết chương trình tạo ra 1 list có n phần tử, n nhập tư bàn phím các phần tử là số ngẫu nhiên từ (1,100) 
public class arraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập số lượng phần tử
		System.out.println("Nhập số lượng phần tử ");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			int randomNumber = random.nextInt(100) + 1; // Tạo số ngẫu nhiên từ 1 đến 100
			list.add(randomNumber);
		}

		System.out.println("danh sách số ngẫu nhiên");
		for (Integer number : list) {
			System.out.println(number + "");
		}
	}
}
