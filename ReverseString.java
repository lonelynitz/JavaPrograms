public class ReverseString {

    public static void main(String[] args) {
        
        String A = "Hello world";
       
        String b = "";

        for(int i =0;i<A.length();i++){
           char info = A.charAt(i);
           b = info + b;
        }
        System.out.println("Reversed String : " + b.toString());
    }
}
