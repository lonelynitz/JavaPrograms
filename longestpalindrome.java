public class longestpalindrome {
    
    public static int longpalindrome(String x){

        int size = x.length();
        int maxvalue = 1;
        int start;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){

                int flag = 1;

                for(int k=0;k<(j-i+1)/2;k++){
                    if(x.charAt(i+k) != x.charAt(j-k)){
                        flag = 0;
                    }
                }
                if(flag != 0 && (j-i+2)>maxvalue){
                    start = i;
                    maxvalue = j-i+1;
                }
            }
        }
        return maxvalue;
    }

    public static void main(String[] args) {
        
    }
}
