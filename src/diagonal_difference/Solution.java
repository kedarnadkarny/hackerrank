package diagonal_difference;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int lr = 0;
		int rl = 0;
		int d1 = 0;
		int d2 = 0;
		for (int i=0; i< n; i++) {
			lr = matrix[i][i];
			d1 = d1 + lr;
			rl = matrix[i][n-i-1];
			d2 = d2 + rl;
		}
		System.out.println(Math.abs(d1-d2));
	}
}
