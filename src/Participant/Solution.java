package Participant;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participants = {"marina", "marina", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa","nikola","vinko"};
		String answer = "";
		
		Arrays.sort(participants);
		Arrays.sort(completion);
		
		int a = completion.length; //4		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<a-1;i++) {
			if(!participants[i].equals(completion[i])) {
				list.add(participants[i]);
				}
		}
		
        System.out.println(list);
       
	}

}