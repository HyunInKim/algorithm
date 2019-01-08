package Get_Center_String;
class Solution{
	public String solution(String s) {
		String answer = "";
		String[] answer_word;
		answer_word = s.split("");
		int a = s.length()/2;
		if(s.length()%2 == 1) {
			return answer_word[a];
		}
		int b = s.length()/2;
		int c = s.length()/2-1;
		answer = s.substring(c,b);
		return answer;
		//return s.substring((s.length()-1) /2 , s.length()/2+1);
	}
}
public class center_number {

	public static void main(String[] args) {
		Solution ss = new Solution();
		System.out.println(ss.solution("qwer"));

	}

}
