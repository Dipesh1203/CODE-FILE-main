

public class FlyedsCycleFindLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!= null){
            slow =slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast= head;
        boolean cycle = false;
        //detect cycle
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        //find meeting point
        slow = head;
        Node prev = null ;//last node
        while(fast!= slow){
            prev = fast;
            slow= slow.next;
            fast=fast.next;

        }
        //remove cycle ->last.next = null
        prev.next = null;
    }
    public static void main(String args[]){
        FlyedsCycleFindLL ll = new FlyedsCycleFindLL();
        head = new Node(1);
        Node temp = new Node(2);
        head.next =temp;
        head.next.next = new Node(3);
        head.next.next.next= temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
