package Password;
class Sol{
	public String solution(String s,int n) {
		char[] ch1 = new char[s.length()];
		StringBuffer sb1 = new StringBuffer();
		for(int i=0;i<ch1.length;i++) {
			ch1[i] = s.charAt(i);
			if(Character.isUpperCase(ch1[i])) { //대문
				if(ch1[i]+n > 90) {
					int cnt = ch1[i]-26+n;
					sb1.append((char)cnt);
				}else {
					int cnt2 = ch1[i]+n;
					sb1.append((char)cnt2);
				}
				
			}
			else if(Character.isLowerCase(ch1[i])) {//소문
				if(ch1[i]+n > 122) {
					int cnt = ch1[i]-26+n;
					sb1.append((char)cnt);
				}else {
					int cnt2 = ch1[i]+n;
					sb1.append((char)cnt2);
				}
			}
			else { //공백
				sb1.append(" ");
				
			}
		}
		return sb1.toString();
	}
}
public class pass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sol ss = new Sol();
		System.out.println(ss.solution("X Y Z", 1));

	}

}
