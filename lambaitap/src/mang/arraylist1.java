package mang;

import java.util.ArrayList;
import java.util.Scanner;

////viết chương trình nhập vào 1 danh sách list có n phần tử, n do người dùng nhập sau đó 
//1. tạo ra 1 list mới bình phương các phần tử 
//2. xác định bao nhiêu phần tử lớn hơn 50
public class arraylist1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập số lượng phần tử
		System.out.println("Nhập số lượng phần tử ");
		int n = sc.nextInt();

		// Nhập dánh sách
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Nhập " + n + " phần tử: ");
		for (int i = 0; i < n; i++) {
			int element = sc.nextInt();
			list.add(element);
		}

		// Bình phương phần tử trong mảng
		ArrayList<Integer> squaredList = new ArrayList<Integer>();
		for (Integer element : list) {
			squaredList.add(element * element);
		}

		// Xác định số lượng phần tử lớn hơn 50
		int count = 0;
		for (Integer element : squaredList) {
			if (element > 50) {
				count++;
			}
		}

		// In kết quả
		System.out.println("\nDanh sách bình phương");
		for (Integer element : squaredList) {
			System.out.println(element + "");
		}

		System.out.println("\nSố lượng phần tử lớn hơn 50: " + count);

	}
}
