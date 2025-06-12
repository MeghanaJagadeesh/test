package basics;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
	public static void main(String[] args) {
		int num[] = { 2, 5, -1, 3, 9, -2, 34 };
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		int k = 3;
		for (int i = 0; i < num.length; i++) {
			queue.add(num[i]);
			if (i >=  k) {
				queue.poll();
			}
		}
		System.out.println("kth largest element : " + queue.peek());
		Arrays.sort(num);
		// Above code's TC=O(n) SC=O(1)
		// the below code's time complexity is O(n log n) and SC is O(1)
		System.out.println(Arrays.toString(num));
		System.out.println(num[num.length - k]);
	}
}
