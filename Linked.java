public class Linked {
        Node head;
        Node nodeNext;
        Node n1;

        public Linked(){
            this.head=null;
        }
        public void append(int data) {

            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                n1=head;

            } else {
                //n1=newNode.next;
                n1.next=newNode;
                n1=n1.next;

            }
        }
        public void display(){
            Node start=head;
            while (start!=null){
                System.out.print(start.data+ "->");
                start=start.next;
            }
            System.out.println("null");
        }
        public void length(){
            int count=0;
            Node current=head;
            while(current!=null){
                count++;
                current=current.next;
            }
            System.out.println(count);
        }
    //implement method to insert new node at ending
    public void newEnding(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
   public void newBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        while (head!=null) {
            System.out.print(head.data + "->");
            head=head.next;
        }}



}

