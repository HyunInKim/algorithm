package String_sort;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		String[] strings = {"abce","abcd","cdx"};
		
		int n = 2;
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<strings.length;i++) {
			list.add(strings[i].charAt(n)+strings[i]);
		}
		
		Collections.sort(list);
		String[] answer = new String[list.size()];
		for(int j=0;j<answer.length;j++) {
			answer[j] = list.get(j).substring(1);
			System.out.println(answer[j]);
		}
		
	}
	

}
