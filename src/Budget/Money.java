package Budget;

import java.util.Arrays;

class Solution{
	public int solution(int[] d,int budget) {
		int sum=0;
		int count = 0;
		int a = 0;
		Arrays.sort(d);
		for(int i=0;i<d.length;i++) { 
			sum = sum+d[i];
		}
		if(sum==budget) {
			return d.length;
		}
		for(int j=0;j<d.length;j++) {
			a = a + d[j];
			if(a>budget) {
				return count;
			}
			count+=1;
		}
		return count;
	}
}
public class Money {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int b = 9;
		Solution ss = new Solution();
		System.out.println(ss.solution(d,b));

	}

}
