
public class zohoInterview {
    
    public static long finder(int arr[],int n){

        long sum = 0;
        long maxvalue = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i] ;

            if(sum > maxvalue){
                maxvalue = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxvalue;
    }

    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6};
        int n = arr.length;
        
        System.out.println(finder(arr, n));
    }
}
