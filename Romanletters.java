package Looptask;

import java.util.HashMap;
import java.util.Map;

public class Romanletters {

    public static int romanfinder(String a){

         Map<Character , Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len = a.length();
        int output = 0;

        for(int i=0;i<map.size();i++){

            if(i<len-1 && map.get(a.charAt(i))<map.get(a.charAt(i+1))){
                output += map.get(a.charAt(i)) - map.get(a.charAt(i+1));
                i++;
            }else{
                output += map.get(a.charAt(i));
            }
        }
        return output;
    }

    public static void main(String[] args) {
        
    }
    
}
