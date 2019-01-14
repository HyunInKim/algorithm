package Password;
class Solution{
	public String solution(String s, int n) {
		char[] ch = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		if(n==0) {
			return s;
		}
		for(int i=0;i<ch.length;i++) {
			if((int)ch[i]!=' ') {
				if((int)ch[i]==90 || (int)ch[i]==122) {
					int cnt = (int)ch[i]-26+n;	
					ch[i] = (char)cnt;
				}else {
					int cnt = (int)ch[i]+n;	
					ch[i] = (char)cnt;
				}
				//System.out.println(qq);
			}else {
				ch[i] = 32;
			}			

		}
		for(int j=0;j<ch.length;j++) {
			sb.append(Character.toString(ch[j]));
		}
		
		return sb.toString();
	}
}
public class pass {

	public static void main(String[] args) {
		String a = "Y";
		Solution ss= new Solution();
		System.out.println(ss.solution(a,2));

	}

}
