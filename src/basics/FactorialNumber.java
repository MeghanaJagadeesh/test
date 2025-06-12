package basics;

public class FactorialNumber {
	public static void main(String[] args) {
		int num = 8;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println(fact);
		System.out.println(fact(num));
	}

	public static int fact(int n) {
		if (n >= 1) {
			return n * fact(n - 1);
		}
		return 1;
	}
}
