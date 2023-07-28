import java.util.ArrayList;
import java.util.List;

public class primenumber {

    static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findprime(int x){
        ArrayList<Integer> alpha = new ArrayList<>();

        for(int i=1;i<x;i++){
            if(isPrime(i) && isPrime(x-i)){
                alpha.add(i);
                //alpha.add(x-i);
            }
        }

        return alpha;
    }

    public static void main(String[] args) {
        
        System.out.println(findprime(23));
    }
}
