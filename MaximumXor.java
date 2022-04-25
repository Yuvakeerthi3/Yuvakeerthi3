

public class MaximumXor {
	public void maxi() {
		int max = 0;
		int num[] = new int[] { 3, 10, 5, 25, 2, 8 };
		for (int i = 0; i < num.length; i++) {
			int res = num[i] ^ num[i + 1];
			if (res > max) {
				max = res;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		MaximumXor mx = new MaximumXor();
		mx.maxi();
	}
}
