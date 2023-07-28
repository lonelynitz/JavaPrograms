public class largestnumarr{

    public static String listofnum(int[] a){

        String empty = "";
        for(int i=a.length-1;i>=0;i--){
            empty += a[i] ;
            }
        return empty.toString();

    }
    public static void main(String[] args) {
        
        int[] a = {1,3,5,7,3,8};
        System.out.println(listofnum(a));
    }
}
