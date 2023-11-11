public class intersectionTwoLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public void print(Node head){
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
    public Node intersectionTwoNode(Node head1,Node head2){
        Node temp2,temp1;
        while(head2!=null){
            Node temp =head1;
            while(temp!=null){
                if(temp == head2){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
            
        }
        return null;

    }
    public static void main(String args[]){
        intersectionTwoLL ll=new intersectionTwoLL();
        Node head1 = new Node(10);
        Node head2 = new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        ll.print(head1);
        ll.print(head2);
        Node intersectionpoint=ll.intersectionTwoNode(head1,head2);
        System.out.println(intersectionpoint.data);
    }

}
