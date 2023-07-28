package Looptask;

public class extraindex {
    
    public static int findindex(int a[] , int b[], int c){
 
        for(int i =0 ; i<c;i++){
            for(int j=0;j<c;j++){
                if(i != c-1){
                    if(a[i] != b[i]){
                        return i;
                    }
                }else{
                    return i;
                }
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = {1,2,3,4,5,6,7,8,9};
        int c = b.length;
        //int c = a.length;

        System.out.println(findindex(a,b,c));
    }
}
