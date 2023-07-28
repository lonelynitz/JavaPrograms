public class reverseword {

    public static String eachword(String a){

        String[] word = a.split("\\s");
        String reverseword = "";

        for(String b : word){
            StringBuilder alpha = new StringBuilder(b);
            alpha.reverse();
            reverseword += alpha.toString()+" ";
        }
        return reverseword.trim();
    }
    
    public static void main(String[] args) {
        
        System.out.println(eachword("welcome you guys"));
    }
}
