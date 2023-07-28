package Looptask;

import java.util.HashSet;

public class Unionset {

    public static int Unionset(int a[] , int b[] , int m , int n){

        HashSet<Integer> alpha = new HashSet<>();

        for(int i=0;i<a.length;i++){
            alpha.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            alpha.add(b[j]);
        }

        return alpha.size();
    }
    public static void main(String[] args) {

         int a[] = {1,2,3,4,5,6};
         int b[] = {1,4,6};

         int n = a.length;
         int m = b.length;
        
        System.out.println(Unionset(a,b,m,n));
    }
}
