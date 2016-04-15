package Y15.M10.D27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * A. Duff and Meat
 * http://codeforces.com/contest/588/problem/A
 * 
 * @author GenialX
 *
 */
public class Q1 {

	public static void main(String[] args) {
		out 		 = new PrintWriter(System.out);
		MyScanner in = new MyScanner();
		
		int number 			= in.nextInt();
		int sumPrice	    = 0;
		int currentMinPrice = 10000;
		
		for(int i = 0; i < number; i++) {
			int a = in.nextInt();
			int p = in.nextInt();
			if(p < currentMinPrice) {
				currentMinPrice = p;
			}
			sumPrice += a * currentMinPrice;
		}
		
		System.out.println(sumPrice);
	}
	
	public static PrintWriter out;
	public static class MyScanner {
		
		BufferedReader br;
		StringTokenizer st;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while( st == null || ! st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
		
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		
		public String nextLine() {
			String str = "";
			try{
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		
		public void close() {
			try {
				br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}