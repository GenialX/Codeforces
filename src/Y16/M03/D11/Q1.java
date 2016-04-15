package Y16.M03.D11;
import java.util.Scanner;

/**
 * B. Image Preview
 * http://codeforces.com/contest/650/problem/B
 * 
 * @author GenialX
 * 
 */
public class Q1 {
	
	public static void main(String args[]) throws Exception{
		new Q1();
	}
	
	Scanner in;
	int n;
	int a;
	int b;
	int T;
	String photos;
	int max;
	
	int curT;
	int []pre;
	int []suf;
	int i, j;
	
	public Q1() {
		in = new Scanner(System.in);
		n = in.nextInt();
		a = in.nextInt();
		b = in.nextInt();
		T = in.nextInt();
		photos 	= in.next();
		curT 	= T;
		pre = new int[500005];
		suf = new int[500005];
		
		if(photos.charAt(0) == 'w') {
			curT -= b;
		}
		
		--curT;
		
		if(curT < 0) {
			System.out.println(0);
			return;
		}
		
		
		for(i = 0; i < n; i++) {
			if(i == 0) {
				pre[i] = 0; // 正着读
				suf[i] = 0; // 反着读
			} else {
				pre[i] = pre[i - 1] + cost(i);
				suf[i] = suf[i - 1] + cost(n - i);
			}
		}

		/** 正着看穷举 **/
		for(i = 0; i < n; i++) {
			if(pre[i] > curT) break; // 当前所耗时间超过剩余时间
			int l = 0; int r = n - 1 - i;
			int tmp = -1;
			while(l <= r) {
				int mid = ( l + r )>>1;
				if( pre[i] + suf[mid] + i * a <= curT) { // i * a 代表翻转过程中需要翻过已读相片的时间
					tmp = mid;
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
			
			if(tmp != -1) {
				max = Math.max(max, tmp + i );
			} else {
				max = Math.max(max, i);
			}
		}
		
		/** 反着看穷举 **/
		for(i = 0; i < n; i++) {
			if(suf[i] > curT) break;
			int l = 0; int r = n - 1 - i;
			int tmp = -1;
			while(l <= r) {
				int mid = ( l + r )>>1;
				if( suf[i] + pre[mid] + i * a <= curT) {
					tmp = mid;
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
			
			if(tmp != -1) {
				max = Math.max(max, tmp + i);
			} else {
				max = Math.max(max, i);
			}
		}
		
		System.out.println(max + 1);
		
		return ;
	}
	
	public int cost(int i) {
		if(photos.charAt(i) == 'w') {
			return a + b + 1;
		} else {
			return a + 1;
		}
	}
	
}
