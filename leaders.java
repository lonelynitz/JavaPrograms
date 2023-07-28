package Looptask;

import java.util.ArrayList;

public class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        
        int max =-1;
        int[] total;
        for(int i=n-1;i>=arr.length();i--){
            if(arr<max){
                total += arr[i];
                max = total;
                break;
            }
        }
        
        System.out.println(total);
    }
} {
    
}
