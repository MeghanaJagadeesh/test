package basics;

public class ReverseNumber12 {
	public static void main(String[] args) {
		int num = 1234;
		int result = 0;
		while (num != 0) {
			result = result * 10 + num % 10;
			num /= 10;
		}
		System.out.println(result);
	}
}
