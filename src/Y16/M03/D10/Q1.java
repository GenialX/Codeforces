package Y16.M03.D10;
import java.util.Arrays;
import java.util.Scanner;

/**
 * A. Watchmen
 * http://codeforces.com/contest/650/problem/A
 * 
 * @author GenialX
 * 
 */
public class Q1 {
	public static void main(String args[]) throws Exception{
		Scanner in = new Scanner(System.in);
		int pairCount = in.nextInt();
		long sum = 0;
		int[] x  = new int[pairCount];
		int[] y  = new int[pairCount];
		long[] z = new long[pairCount];
		for(int i = 0; i < pairCount; i++)  {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			z[i] = (x[i] + 1000000000L);
			z[i] *= 10000000000L;
			z[i] += y[i];
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		Arrays.sort(z);;

		sum = Q1.getIntSum(x, pairCount);
		sum += Q1.getIntSum(y, pairCount);
		sum += Q1.getLongSum(z, pairCount);
		
		System.out.println(sum);
		in.close();
		return ;
	}
	
	public static long getLongSum(long[] x, int N) {
		int xCnt = 0;
		long xLast = Long.MIN_VALUE;
		long sum = 0;
		
		for(int i = 0; i < N; i++) {
			if(xLast != x[i]) {
				sum -= xCnt * (xCnt - 1) / 2;
				xLast = x[i];
				xCnt = 1;
			} else {
				xCnt++;
			}
		}
		sum -= xCnt * (xCnt - 1) / 2;
		
		return sum;
	}
	
	public static long getIntSum(int[] x, int N) {
		int xCnt = 0;
		int xLast = Integer.MIN_VALUE;
		long sum = 0;
		
		for(int i = 0; i < N; i++) {
			if(xLast != x[i]) {
				sum += xCnt * (xCnt - 1) / 2;
				xLast = x[i];
				xCnt = 1;
			} else {
				xCnt++;
			}
		}
		sum += xCnt * (xCnt - 1) / 2;
		
		return sum;
	}
	
}
