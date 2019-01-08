package Get_Center_String;
class Solution{
	public String solution(String s) {
		if(s.length()%2 == 1) {
			return s.substring(s.length()/2,s.length()/2+1);
		}
		 
		return s.substring(s.length()/2-1,s.length()/2+1);
		
	}
}
public class center_number {

	public static void main(String[] args) {
		Solution ss = new Solution();
		System.out.println(ss.solution("abced"));

	}

}
