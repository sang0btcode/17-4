package mang;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

////viết chương trình nhập vào 1 list có n phần tử ngẫu nhiên các phần tử là số nguyên, n nhập từ bàn phím 
//1. in ra có bao nhiêu số nhỏ hơn 80
//2. in ra vị trí index các số nhỏ đó
public class arrayList2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập số lượng phần tử
		System.out.println("Nhập số lượng phần tử");
		int n = sc.nextInt();

		// Tạo danh sách ngẫu nhiên
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int randomNumber = random.nextInt(100);
			list.add(randomNumber);
		}

		// Đếm số lượng phần tử nhỏ hơn 80
		int count = 0;
		ArrayList<Integer> positions = new ArrayList<Integer>(); // Lưu trữ vị trí index
		for (int i = 0; i < n; i++) {
			int element = list.get(i);
			if (element < 80) {
				count++;
				positions.add(i);
			}
		}
		// In kết quả
		System.out.println("\nDanh sách ngẫu nhiên");
		for (Integer element : list) {
			System.out.println(element + "");
		}
		System.out.println("\nSố lượng phần tử nhỏ hơn 80: " + count);

		if (count > 0) {
			System.out.println("\nVị trí index của các số nhỏ hơn 80:");
			for (Integer position : positions) {
				System.out.println(position + "");
			}
		} else {
			System.out.println("Không có số nào nhỏ hơn 80");
		}

	}
}
