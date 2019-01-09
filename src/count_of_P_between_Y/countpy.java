package count_of_P_between_Y;
class Solution{
	public boolean solution(String s) {
		//boolean answer = true;
		s = s.toUpperCase(); // 모두 대문자로 변환 
		//.toLowerCase();    // 모두 소문자로 변환 
		int Pcount = 0;
		int Ycount = 0;
		String[] word;
		word = s.split("");
		for(int i=0;i<word.length;i++) {
			if(word[i].equals("P")) {
				Pcount+=1;
			}
			else if(word[i].equals("Y")) {
				Ycount+=1;
			}
		}
		if(Pcount==Ycount) {
			return true;
		}
		
		return false;
	}
}
public class countpy {

	public static void main(String[] args) {
		Solution ss = new Solution();
		System.out.println(ss.solution("PppPPYyyYY"));

	}

}
