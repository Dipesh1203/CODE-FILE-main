public class doublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add first
    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next  = head;
        head.prev = newNode;
        head = newNode;
    }
    //addlast
    public void addLast(int data){
        size++;
        Node newNode =new Node(data);
        if(tail == null){
            tail = head =  newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }
    // print 
    public void print(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //remove fIirst
    public int removeFirst(){
        if(head == null){
            System.out.println("Doubly ll is empty");
            return Integer.MIN_VALUE; 
        }
        if(size == 1){
            int val =head.data;
            head= tail = null;
            size--;
            return val;
        }
        int val =head.data;
        head = head.next;
        head.prev= null;
        size--;
        return val;
        
    }
    //remove last
    public int removeLast(){
        if(head == null){
            System.out.println("Doubly ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = tail.data;
            tail = head = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val; 
    }
    //reverse doubly ll 
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr=next;
        }
        head = prev;
    }
    public static void main(String args[]){
        doublyLinkedList dll = new doublyLinkedList();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(5);
        dll.removeFirst();
        dll.removeLast();
        dll.removeFirst();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
