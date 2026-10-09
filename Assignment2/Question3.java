public class CircularQueue {

    int[] queue = new int[5];

    int front = -1;
    int rear = -1;

  
    void enqueue(int value) {

        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue Overflow.");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % queue.length;

        queue[rear] = value;

        System.out.println(value + " inserted.");
    }

    
    void dequeue() {

        if (front == -1) {
            System.out.println("Queue Underflow.");
            return;
        }

        System.out.println(queue[front] + " removed.");

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    
    void peek() {

        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front = " + queue[front]);
        }
    }

   
    void display() {

        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue:");
        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("After operations:");
        queue.display();

        queue.peek();
    }
}
