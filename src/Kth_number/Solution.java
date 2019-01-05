package Kth_number;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		int[] array = {1,4,5,2,3,6,7};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int e=0,s=0,k=0,i=0;
		int[] arr2 = {};
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                s = commands[i][j];
                e = commands[i][j+1];
                k = commands[i][j+2];
                break;
            }
            arr2 = Arrays.copyOfRange(array,s-1,e);
            Arrays.sort(arr2);
            list.add(arr2[k-1]);
    		
        }
		System.out.println(list);
		
	}
}
