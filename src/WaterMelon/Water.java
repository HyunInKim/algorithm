package WaterMelon;
import java.util.*;
class Solution{
	public String solution(int n) {
		ArrayList<String> list = new ArrayList<String>();
		String answer = "";
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				list.add("수");	
			}else
			{
				list.add("박");
			}
		}
		for(int j=0;j<list.size();j++) {
			answer += list.get(j);
		}
		//System.out.println(list);
		return answer;
	}
}
public class Water {

	public static void main(String[] args) {
			Solution ss = new Solution();
			System.out.println(ss.solution(3));
			
	}

}


//Stringbuffer