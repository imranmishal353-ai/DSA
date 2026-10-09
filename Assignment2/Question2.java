public class QueueLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    
    void enqueue(int value) {

        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted.");
    }

    
    void dequeue() {

        if (front == null) {
            System.out.println("Queue Underflow.");
            return;
        }

        System.out.println(front.data + " removed.");

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    
    void peek() {

        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front = " + front.data);
        }
    }

   
    void display() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue:");
        queue.display();

        queue.peek();

        queue.dequeue();

        System.out.println("After dequeue:");
        queue.display();
    }
}
