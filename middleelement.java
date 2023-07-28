package Looptask;

import java.util.List;

import org.w3c.dom.Node;

public class middleelement {

    public static void middlevalue(Node a){
    
        Node small = a;
        Node fast = a;

        if(fast != null && fast.next!= null){
            small = small.next;
            fast = fast.next.next;
        }

        return small.next;
    }
    
}
