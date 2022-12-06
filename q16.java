package project_euler;


import java.math.BigInteger;


public final class q16 {
	
	public static void main(String[] args) {
		System.out.println(new q16().run());
	}
	public String run() {
		String temp = BigInteger.ONE.shiftLeft(1000).toString();
		int sum = 0;
		for (int i = 0; i < temp.length(); i++)
			sum += temp.charAt(i) - '0';
		return Integer.toString(sum);
	}
	
}
