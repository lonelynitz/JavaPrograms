public class removeString {

    public static String removeStringa(String a , String b){

        for(int i=0;i<b.length();i++){
            char ch = b.charAt(i);
           
            while(a.contains(ch+"")){
                int st = a.indexOf(ch);
                a = a.replace((ch+""), " ");
            }
        }
        return a;
    }
    public static void main(String[] args) {
        
        System.out.println(removeStringa("vasanth", "run"));
    }
    
}
