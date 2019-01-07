package lost_my_gymsuit;


class Solution{
	public int solution(int n,int[] lost,int[] reserve) {
		int answer = n-lost.length;
		int[] student = new int[n];
		for(int i=0;i<student.length;i++) {
			student[i] = 1;
			
		}
		for(int r:reserve) {
			student[r-1]+=1;
			
		}
		for(int l:lost) {
			student[l-1] -=1;
		}
		
		for(int j=0;j<student.length;j++) {
			
			if(student[j]==0 && student[j+1]>=2) {
				student[j] = student[j] + 1;
				student[j+1] = student[j+1] - 1;
				answer = answer + 1;
				
			}
			else if(student[j]==0 && student[j-1]>=2) {
				student[j] = student[j] + 1;
				student[j-1] = student[j-1] - 1;
				answer = answer + 1;
			}
			
			
		}
		for(int a:student) {
			System.out.println(a);
		}
	
		
		
		
		return answer;
	}
}
public class Loangymsuit {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		Solution sol = new Solution();
		System.out.println(sol.solution(n, lost, reserve));
		
		
	}

}


/*Arrays.sort(lost);
Arrays.sort(reserve);
for(int i=1;i<=n;i++) {
	int a = Arrays.binarySearch(lost, i);
	if(a>=0) {
		if(i==1) {
			int b = Arrays.binarySearch(reserve, i);
			if(b>=0) {
				answer = answer + 1;
			}
			
		}
		else {
			int c = Arrays.binarySearch(reserve, i+1);
			//int d = Arrays.binarySearch(reserve, i-1);
			if(c>=0) {
				answer = answer + 1;
			}
		}
	}//check a
	
}


return answer;
*/



/*sum
for(int j=0;j<student.length;j++) {
answer = answer + student[j];
}*/