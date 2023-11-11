import javax.swing.LayoutStyle;

public class circularLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node last;
    public int size;
    public void print(){
        Node curr=last.next;
        while(curr ==last){
            System.out.println(curr.data+" ");
            curr=curr.next;

        }
    }
    public Node addToEmpty(Node last, int data) {
        if (last != null){
            return last;
        }
        Node newNode=new Node(data);
        last = newNode;
        newNode.next = last;
        return last;
    }
    public Node addFront(Node last, int data) {
        if (last == null){
            return addToEmpty(last, data);
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }
    public Node addEnd(Node last, int data) {
            if (last == null){
                return addToEmpty(last, data);
            }
            Node newNode = new Node(data);
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
            return last;
        }
        
    public static void main(String args[]){
        circularLL cll = new circularLL();;
        cll.addToEmpty(null, 5);
        cll.addFront(null, 1);
        cll.addEnd(null, 0);
        cll.print();

    }
}
