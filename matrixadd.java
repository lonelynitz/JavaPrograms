public class matrixadd {

    public static int matrixvalues(int a , int b , int[][] grid){
        int sum =0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){

                sum += grid[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9};

        System.out.println(matrixvalues(a,b, new int[a][b]));
    }
    
}
