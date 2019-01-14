package ParticipantUseHashMap;

import java.util.*;

class Solution{
	public String solution(String[] participant,String[] completion) {
		  String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0)+1);
	        for (String player : completion) hm.put(player, hm.get(player) - 1);

	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){
	                answer = key;
	            }
	        }
	        return answer;
	}
}
public class ParticipantuseHashMap {

	public static void main(String[] args) {
		String[] participant = {"a","b","c"};
		String[] completion = {"a","b"};
		Solution ss = new Solution();
		System.out.println(ss.solution(participant, completion));
		
		

	}

}
