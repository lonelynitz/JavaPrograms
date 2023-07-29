public class fibonices {

    public static void printfib(int x){
        int first=0; int second =1;

        for(int i=0;i<x;i++){
            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }
    }
    
    public static void main(String[] args) {
        printfib(10);
    }
}
