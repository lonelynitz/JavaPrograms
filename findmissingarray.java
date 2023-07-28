import java.util.HashSet;

public class findmissingarray {

    public static HashSet missingvalue(int[] a , int[] b , int n , int m ){

        HashSet alpha = new HashSet<>();

        for(long c : b){
            alpha.add(c);
        }

        HashSet beta = new HashSet<>();

        for(long d : a){
            if(!alpha.contains(d)){
                beta.add(d);
            }
        }
        return beta;
    }

    public static void main(String[] args) {
         
        int[] a = {1,2,4,5,6,7,8};
        int[] b = {1,2,9,4};

        System.out.println(missingvalue(a, b, 0, 0));
    }
}
