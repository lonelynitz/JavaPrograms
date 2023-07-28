public class letterswithnumber {
    
    public static String letter(String a){
        String count = "";

        for(int i=0;i<a.length();i++){
            count += a.charAt(i);

            int b = 1;
            while(i+1 < a.length() && a.charAt(i)==a.charAt(i+1)){
                i++;
                b++;
            }
            count += b+"";
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(letter("aaabbb"));
    }
}
