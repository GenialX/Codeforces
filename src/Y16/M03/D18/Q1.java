package Y16.M03.D18;
import java.util.Scanner;

/**
 * B. Table Compression
 * http://codeforces.com/contest/650/problem/C
 * 
 * @author GenialX
 * 
 */
public class Q1 {
	
	public static void main(String args[]) throws Exception{
		new Q1();
	}
	
	Scanner in;
	int [][]x, y, z;
	int n, m;
	int i, j, k;
	
	
	public Q1() {
		in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		if(n == 1 && m == 1) {
			System.out.println(1);
			return;
		}
		if(n == 1) {
			x = new int[1][m];
			for(i = 0; i < m; i++) {
				x[0][i] = in.nextInt();
			}
		}
		if(m == 1) {
			
		}
		for(i = 0; i < n; i++) {
			for(j = 0; j < m; j++) {
				
			}
		}
		
		// ... maybe, it's so hard for me. I would make it out later.
		
		
		
		
		return ;
	}
	
}
