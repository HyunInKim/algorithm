package Descending_order;
import java.util.*;
class Solution {
  public String solution(String s) {
   	String answer = "";
		String[] word;
		word = s.split("");

		List<String>list = Arrays.asList(word);
		Collections.sort(list);
		Collections.reverse(list);
		//System.out.println(list);
		for(int i=0;i<list.size();i++) {
			answer += list.get(i);
		}
		return answer;
  }
}
public class Descending {

	public static void main(String[] args) {
		Solution ss = new Solution();
		System.out.println(ss.solution("qerwqrrWRWs"));

	}

}
