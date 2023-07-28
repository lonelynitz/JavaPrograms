public class leftstar {
    public static void main(String[] args) {
        
        int a=5;

        for(int i=0;i<a;i++){
            for(int j=2*(a-i);j>0;j--){
                 System.out.println(" ");
                for(int k=0;k<=i;i++){
                    System.out.println("* ");
                }
                System.out.println();
            }
        }
    }
    
}
