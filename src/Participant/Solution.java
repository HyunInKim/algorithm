package Participant;

import java.util.*;

class participants{
	public String solution(String[] participant,String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int a = participant.length; //4	
		int i =0;
		ArrayList<String> list = new ArrayList<String>();
		
		for(i=0;i<a-1;i++) {
			if(!participant[i].equals(completion[i])) {
				
				return participant[i];
			}
		}
		return participant[i];
       
	}
		
}

public class Solution {

	public static void main(String[] args) {
		String[] participants = {"marina", "marina", "nikola", "vinko", "filipa"};
		String[] completion = {"marina", "filipa","nikola","vinko"};
		participants part= new participants();
		System.out.println(part.solution(participants,completion));
	}

}