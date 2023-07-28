import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrangeevenodd {
    
    public static void oddeven(long[] a , int n){

        ArrayList<Long> alpha = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1){
                alpha.add(a[i]);
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                alpha.add(a[i]);
            }
        }
        for(int i=0;i<a.length;i++){
            a[i] = alpha.get(i);
        }
    }

    public static void main(String[] args) {

        long[] a ={1,2,3,9,8,7,6,5,4};
        
        oddeven(a, 0);
        for(long b:a){
            System.out.print(b+"");
        }
    }
}
