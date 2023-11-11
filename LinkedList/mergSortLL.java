import java.util.LinkedList;
public class mergSortLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            data = this.data;
            next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step-1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step-2 = newNode next= head
        newNode.next =head;//link
        //step-3 = head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next= newNode;
        tail =newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    private Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }
    private Node merg(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 !=null && head2 !=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next =head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergsort(Node head){
        //base case
        if(head == null || head.next==null){
            return head;
        }
        //find mid
        Node mid= getmid(head);
        //left & righthalf
        Node rightHead = mid.next;
        mid.next = null;
        Node newRight = mergsort(head);
        Node newLeft = mergsort(rightHead);
        //merge
        return merg(newLeft,newRight);


    }
    public static void main(String args[]){
        mergSortLL ll = new mergSortLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1
        ll.print();
        ll.head = ll.mergsort(ll.head);
        ll.print();

    }
}
