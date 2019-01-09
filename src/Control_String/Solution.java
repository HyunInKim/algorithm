package Control_String;
class test{
	public boolean solution (String s) {
		boolean answer = false;
		if(s.length()==4 || s.length()==6) {
			try {
				int d= Integer.parseInt(s);
				answer = true;
			}catch(NumberFormatException nfe) {
				answer= false;
			}
			
		}
		return answer;
		
	}
}
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test tt= new test();
		System.out.println(tt.solution("1234aa"));

	}

}
