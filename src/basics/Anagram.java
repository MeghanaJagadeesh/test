package basics;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "heart";
		String s2 = "earth";
		char[] ch1 = s1.toLowerCase().replaceAll("\\s+", "").toCharArray();
		char[] ch2 = s2.toLowerCase().replaceAll("\\s+", "").toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));
	}
}
