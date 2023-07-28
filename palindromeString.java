public class palindromeString {

    public static void main(String[] args) {
        
        String a = "saa";
        String b = "";

        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            b = c + b;
        }
        System.out.println(b);

        if(a.equals(b)){
                System.out.println("It is palindrome");
            }else{
                System.out.println("It is not palindrome");
            }
    }
    
}
