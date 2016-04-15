package Y16.M01.D07;
import java.util.Scanner;

/**
 * A. Pasha and Stick
 * http://codeforces.com/contest/610/problem/A
 * 
 * @author GenialX
 * 
 * 
 */
public class Q1 {
	public static void main(String args[]) throws Exception{
		Scanner in = new Scanner(System.in);
		
		long length = in.nextInt();
		if(length < 6) {
			System.out.println(0);
			in.close();
			return;
		}
		
		if(length % 2 != 0) {
			System.out.println(0);
			in.close();
			return;
		}
		
		long halfLength = length / 2;
		
		if(halfLength % 2 != 0) {
			++halfLength;
		}
		
		System.out.println(halfLength / 2 -1);
		in.close();
		return ;
	}
	
}
