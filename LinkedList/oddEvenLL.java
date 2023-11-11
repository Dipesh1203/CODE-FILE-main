public class oddEvenLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;   
    public int size;
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
    }public void swapNode(int x,int y){
        Node curr=head;
        Node prevx=null;
        Node nextx;
        while(curr.data != x&& curr!=null){
            nextx=curr.next;
            curr.next=prevx;
            prevx = curr;
            curr=nextx;
        }
        Node temp =curr;
        Node prevy=null;
        Node nexty;
        while(curr.data != y&& curr!=null){
            nexty=curr.next;
            curr.next=prevy;
            prevy = curr;
            curr=nexty;
        }
        prevx.next= curr;
        temp.next=curr.next;
        curr.next=prevy;
    }
    public Node mergeLL(Node head1,Node head2){
        Node temp1=head1;
        Node next;
        Node prev=null;
        while(temp1!=null){
            next=temp1.next;
            temp1.next=prev;
            prev=temp1;
            temp1=next;
        }
        prev.next=head2;
        return head1;
    }
    public Node oddEven(Node head1,Node head2){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                Node newNode=new Node(temp.data);
                newNode.next=head1;
                head1=newNode;
            }else{
                Node newNode=new Node(temp.data);
                newNode.next=head2;
                head2=newNode;
            }
            temp=temp.next;
        }
        return mergeLL(head1, head2);
    }
    
    
    public static void main(String args[]){
        oddEvenLL ll = new oddEvenLL();
        Node head1=null;
        Node head2=null;
        ll.addFirst(5);
        ll.addFirst(9);
        ll.addFirst(2);
        ll.addFirst(7);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        ll.oddEven(head1, head2);
        ll.print();

    } 
}
