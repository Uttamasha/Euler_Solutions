package project_euler;


public final class q28{
	
	public static void main(String[] args) {
		System.out.println(new q28().run());
	}
	
	private static final int SIZE = 1001; 
	
	public String run() {
		long sum = 1;  // Special case for size 1
		for (int n = 3; n <= SIZE; n += 2)
			sum += 4 * n * n - 6 * (n - 1);
		return Long.toString(sum);
	}
	
}
