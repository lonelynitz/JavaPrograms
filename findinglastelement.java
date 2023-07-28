package Looptask;

import java.util.LinkedList;
import java.util.List;

public class findinglastelement {

    public static void main(String[] args) {
     
         List a = new LinkedList<>();

    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);

    int b = a.size()-1;
    int c = (int) a.get(b);
    System.out.println(c);

    }

    
}
