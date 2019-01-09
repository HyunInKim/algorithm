package Prime_number;
import java.util.*;
class Solution{
	public int solution(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=2;i<=n;i++) {
			int count = 0;
			for(int j=1;j<=n;j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count<=2) {
				list.add(i);
			}
		}
		return list.size();
	}
}
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution ss = new Solution();
		System.out.println(ss.solution(100));
		
	}

}
