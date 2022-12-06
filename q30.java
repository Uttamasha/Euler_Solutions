package project_euler;


public final class q30{

	
	public String run() {
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
