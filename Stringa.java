package Looptask;

public class Stringa {

    public static String odervise(String a){

        int [] count = new int[26];

        for(int i=0;i<a.length();i++){
            count[a.charAt(i)-'a']++;
        }

        String empty ="";
        for(int i=0;i<26;i++){
            while(count[i]>0){
                empty += (char)(i+'a');
                count[i]--;
            }
        }
        return empty;
    }
}
