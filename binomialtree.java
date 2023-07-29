import org.w3c.dom.Node;

public class binomialtree {
    
    static node(){
        int data;
        Node left;
        Node right;

        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int binomialtreea(node root){

        if(root==0){
            return -1;
        }

        int lh = binomialtreea(root.left);
        int rh = binomialtreea(root.right);

        return Math.max(lh, rh) +1;
    }

}

