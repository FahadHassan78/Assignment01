public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    private Node head;

    LinkedList(){
        this.head=null;
    }

    public void insertAtStart(int data) {
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }

    public void insertAtEnd(int data) {
        Node newnode=new Node(data);
        if(head==null) {
            head=newnode; } else {
            Node current=head;
            while(current.next!=null) {
                current=current.next;
            }
            current.next=newnode;
        }
    }

    public void display() {
        Node current=head;
        while (current!=null) {
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("Null");
    }

    public int size() {
        int count = 0;
        Node current = head;
        while(current !=null) {
            count++;
            current=current.next;
        }
        return count;
    }
public void deleteAtStart() {
        if(head!=null) {
            head=head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);
        list.display(); 
        System.out.println("Size: " + list.size()); // 4
        list.insertAtEnd(50);
        list.display();
        list.deleteAtStart();
        list.display();
    }
}
