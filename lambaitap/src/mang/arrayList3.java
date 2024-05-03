package mang;

import java.util.Arrays;

public class arrayList3 {
	public static void main(String[] args) {
//	    ArrayList<Integer> numbers = new ArrayList<>();
//	    // thêm phần tử cho mảng numbers
//	    numbers.add(3);
//	    numbers.add(1);
//	    numbers.add(14);
//	    numbers.add(5);
//	    numbers.add(15);
//	    numbers.add(25);
//	    numbers.add(35);
//	    numbers.add(2);
//	    ArrayList<Integer> number2 = new ArrayList<>();
//	    for (int i = 0; i < numbers.size(); i++) {
//	      number2.add(numbers.get(i));
//	    }
//	    numbers.sort(null);
//	    System.out.println("day da cho la : ");
//	    System.out.println(number2);
//	    for (int i = 0; i < numbers.size(); i++) {
//	      if (numbers.get(1) == number2.get(i)) {
//	        System.out.println("so be thu 2: " + number2.get(i) + " vi tri la: " + (i + 1));
//	        ;
//	      }
//	      if (number2.get(i) == numbers.get(numbers.size() - 2)) {
//	        System.out.println("so lon thu 2: " + number2.get(i) + " vi tri la: " + (i + 1));
//	        ;
//	      }
//	    }
		int[] a = { 1, 3, 2, 9, 15, 7, 10, 6, 19 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
//	    b = a;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		for (int i = 0; i < b.length; i++) {
			if (a[1] == b[i]) {
				System.out.println("so be thu 2: " + b[i] + " vi tri la: " + (i + 1));
				;
			}
			if (a[b.length - 2] == b[i]) {
				System.out.println("so lon thu 2: " + b[i] + " vi tri la: " + (i + 1));
				;
			}
		}
	}
}
