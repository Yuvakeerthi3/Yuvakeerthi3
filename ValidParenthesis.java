package net.practice;

public class ValidParenthesis {
	public static void main(String[] args) {
		String s = ")()())";
		String s1 = "()";
		char c[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				String sum = s.valueOf(c[i]) + s.valueOf(c[j]);
				System.out.println(sum);
				if (sum.equals(s1)) {
					count++;
				}
			}
		}
		System.out.println("ValidParenthesis =" + count);
	}

}
