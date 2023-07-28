package Looptask;

import java.util.ArrayList;
import java.util.List;

public class snakepattern {

    public static List<Integer> snakepattern(int matrix[][]){

        List a = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=0;j<matrix[j].length;j++){
                     a.add(matrix[i][j]);
                }
               
            }else{
                for(int j=0;j<matrix[j].length;j--){
                     a.add(matrix[i][j]);
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        
        


    }
    
}
