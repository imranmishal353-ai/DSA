public class StackLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

 
    void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;

        System.out.println(value + " pushed.");
    }

    
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow.");
            return;
        }

        System.out.println(top.data + " popped.");
        top = top.next;
    }

   
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top = " + top.data);
        }
    }

    
    void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        stack.display();

        stack.peek();

        stack.pop();

        System.out.println("After pop:");
        stack.display();
    }
}
