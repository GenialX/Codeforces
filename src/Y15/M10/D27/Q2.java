package Y15.M10.D27;
import java.util.Scanner;

/**
 * B. Duff in Love 
 * http://codeforces.com/contest/588/problem/B
 * 
 * @author GenialX
 * 
 * @todo 如何快速的求一个数的所有因数
 * 
 */
public class Q2 {
	public static void main(String args[]) throws Exception{
		Scanner in = new Scanner(System.in);
		
		long maxNum = in.nextLong();
		long currentMaxLovelyNumFactor;
		
		for(long i = maxNum; i >= 1; i--) {
			if(i == maxNum - 1) {
				i = (long) Math.ceil(maxNum / 2);
			}
			boolean isLovely = true;
			if( maxNum % i == 0) {
				currentMaxLovelyNumFactor = (long) Math.ceil( i / 2 );
				if(i <= 2) currentMaxLovelyNumFactor = 2;
				for(long j = 2; j <= currentMaxLovelyNumFactor; j++) {
					if(i % ( j * j ) == 0) {
						isLovely = false;
						break;
					}
				}
				if(isLovely) {
					System.out.println(i);
					in.close();
					return ;
				}
			}
		}
		
		System.out.println(-1);
		in.close();
		return ;
		
	}
	
}
