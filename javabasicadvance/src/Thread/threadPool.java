package Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class threadPool {
	public static long sum(List<Long> numbers) {
		ExecutorService executor = Executors.newFixedThreadPool(4);
		long sum = 0;
		List<Future<Long>> futures = new ArrayList<>();
		for (Long number : numbers) {
			Future<Long> future = executor.submit(() -> number);
			futures.add(future);
		}
		executor.shutdown();`
		for (Future<Long> future : futures) {
			try {
				sum += future.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		List<Long> numbers = Arrays.asList(1L, 2L, 3L, 4L, 5L);
//		long sum = sum(numbers);
		System.out.println("Tổng giá trị: " + sum);
	}
}
