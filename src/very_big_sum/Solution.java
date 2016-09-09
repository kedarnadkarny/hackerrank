package very_big_sum;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum= 0;
		long[] input = new long[n];
		for(int i=0; i<n; i++) {
			input[i] = sc.nextLong();
			sum = sum + input[i];
		}
		System.out.println(sum);
	}
}
