package No_Samenumber;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Please specify the size of the array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<ar.length;i++) {
            System.out.print("["+i+"] :");            
            int inputnumber = sc.nextInt();
            ar[i] = inputnumber;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<ar.length-1;i++) {
            if(ar[i]!=ar[i+1]) {
                list.add(ar[i]);
            }
            
        }
        list.add(ar[n-1]);
        
        System.out.println(list);
        
    }
 
}