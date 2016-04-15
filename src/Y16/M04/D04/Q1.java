package Y16.M04.D04;
import java.util.Scanner;

/**
 * D. Zip-line
 * http://codeforces.com/contest/650/problem/D
 * 
 * @author GenialX
 * 
 */
public class Q1 {
	
	public static void main(String args[]) throws Exception{
		new Q1();
	}
	
	Scanner in;
	
	public Q1() {
		in = new Scanner(System.in);
		int n = in.nextInt();
		int pm = in.nextInt();
		int []c = new int[n + 1];
		int []oc = new int[n + 1];
		int []oa = new int[n];
		int []a = new int[n];
		for(int i = 0; i < n; i++) {
			oc[i] = 1000000000;
			oa[i] = in.nextInt();
		}
		oc[n] = 1000000000;
		oc[0] = -1;
		oc[1] = oa[0];
		for(int z = 0; z < pm; z++) {
			a = oa.clone();
			c = oc.clone();
			a[in.nextInt() - 1] = in.nextInt();
			c[1] = a[0];
			int len = 1;
			for(int i = 1; i < n; i++) {
				int j = this.find(c, len, a[i]);
				c[j] = a[i];
				if(j > len) len = j;
			}
			System.out.println(len);
		}
		return;
	}
	
	private int find(int[] arr, int len, int val) {
		int l = 0, r = len, mid;
		mid = (l + r)>>1;
		while(l <= r) {
			if(val < arr[mid]) {
				r = mid - 1;
			} else if(val > arr[mid]) {
				l = mid + 1;
			} else {
				return mid;
			}
			mid = (l + r)>>1;
		}
		return mid + 1;
	}
	
}
