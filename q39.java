package project_euler;

public final class q39{
	
	public static void main(String[] args) {
		System.out.println(new q39().run());
	}
	
	
	public String run() {
		int mPer = 0;
		int mTri = 0;
		for (int i = 1; i <= 1000; i++) {
			int triangles = count(i);
			if (triangles > mTri) {
				mTri = triangles;
				mPer = i;
			}
		}
		return Integer.toString(mPer);
	}
	
	
	private static int count(int i) {
		int count = 0;
		for (int a = 1; a <= i; a++) {
			for (int b = a; b <= i; b++) {
				int c = i - a - b;
				if (b <= c && a * a + b * b == c * c)
					count++;
			}
		}
		return count;
	}
	
}