
public class numberpalindrome{
    
    public static String number(int a){

        String s=""+a;
        int l=s.length();

        for(int i = 0;i<l/2;i++){
            if(s.charAt(i)!= s.charAt(l-1-i)){
                return "It is not palindrome";
            }else{
                return "It is palindrome";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        
        System.out.println(number(516)) ;   
}
}