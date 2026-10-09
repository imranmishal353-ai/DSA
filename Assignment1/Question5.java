public class Queue2DArray {

    int[][] queue = new int[5][1];

    int front = 0;
    int rear = -1;

    
    void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow.");
            return;
        }

        rear++;
        queue[rear][0] = value;

        System.out.println(value + " inserted.");
    }

    
    void dequeue() {

        if (front > rear) {
            System.out.println("Queue Underflow.");
            return;
        }

        System.out.println(queue[front][0] + " removed.");
        front++;
    }

    
    void peek() {

        if (front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front = " + queue[front][0]);
        }
    }

    
    void display() {

        if (front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i][0] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Queue2DArray queue = new Queue2DArray();

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
