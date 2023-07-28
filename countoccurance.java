package Looptask;

public class countoccurance {

    public static int countoccurancea(int[] a , int s , int x){
        int count = 0;

        for(int i=0;i<a.length;i++){

            if(a[i]==x){
                count++;
            }
        }
        return count;
    }
}
