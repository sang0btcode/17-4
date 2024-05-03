package mang;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//viết chương trình chả lời kết quả các phép tính 
//quest={"2+5+7=","5*10=","sqrt(16)=","12%2="} java
public class hashmap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Tạo tập hợp các phép tính
		Map<String, String> questions = new HashMap<>();
		questions.put("2+5+7= ", "14");
		questions.put("5*10= ", "50");
		questions.put("sprt(16)", "4");
		questions.put("12%2", "0");

		// Lặp qua từng phép tính
		for (Map.Entry<String, String> entry : questions.entrySet()) {
			String question = entry.getKey();
			String answer = entry.getValue();

			System.out.println("Câu hỏi: " + question);

			// Yêu cầu người dùng nhập câu trả lời
			System.out.println("Trả lời của bạn: ");
			String userAnswer = scanner.nextLine();

			// Kiểm tra câu trả lời
			if (userAnswer.equals(answer)) {
				System.out.println("Bạn đã trả lời đúng");
			} else {
				System.out.println("Sai! Đáp án đúng là: " + answer);
			}
		}

	}
}
