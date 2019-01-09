package Prime_number;
import java.util.*;
class Solution{
	public int solution(int n) {
		boolean[] b = new boolean[n+1];
		int count = 0;
		for(int i=2;i<=n;i++) {
			if(b[i] == false) {
				count +=1;
				for(int j=i;j<=n;j+=i) {
					b[j] = true;				
				}
			}			
		}		
		return count;
	}
}
public class Prime {

	public static void main(String[] args) {
		Solution ss = new Solution();
		System.out.println(ss.solution(10000000));
		
	}

}
