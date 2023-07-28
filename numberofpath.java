public class numberofpath {
    
    int count = 0;
    long pathfinder(int a , int b){
        rec(0, 0, a, b);
        return count;
    }
     void rec(int a , int b , int m , int n){
        if(a<0 || b<0 || a>=n || b>=m){
            return ;
        }
        if(a==n-1 && b==m-1){
            count ++;
        }

        rec(a+1, b, m, n);
        rec(a+1, b+1, m, n);
     }
}
