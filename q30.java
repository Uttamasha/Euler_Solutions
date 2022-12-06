package project_euler;


public final class q30{

	
	public String run() {
		// As stated in the problem, 1 = 1^5 is excluded.
		// If a number has at least n >= 7 digits, then even if every digit is 9,
		// n * 9^5 is still less than the number (which is at least 10^n).
		int sum = 0;
		for (int i = 2; i < 1000000; i++) {
			if (i == fifthSum(i))
				sum += i;
		}
		return Integer.toString(sum);
	}
	
	
	private static int fifthSum(int a) {
		int sum = 0;
		while (a != 0) {
			int b = a % 10;
			sum += b * b * b * b * b;
			a/= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(new q30().run());
	}
	
}
