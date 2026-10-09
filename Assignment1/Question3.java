import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter maximum capacity of queue: ");
        int capacity = input.nextInt();
        int[] queue = new int[capacity];
        int front = 0;
        int rear = -1;
        int size = 0;

        int choice = 0;

       
        while (choice != 7) {

            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {

                if (size == capacity) {
                    System.out.println("Queue Overflow! Queue is full.");
                } else {

                    System.out.print("Enter token number: ");
                    int value = input.nextInt();
                    rear++;
                    queue[rear] = value;

                    size++;

                    System.out.println("Token added successfully.");
                }

            }
            else if (choice == 2) {

                if (size == 0) {
                    System.out.println("Queue Underflow! Queue is empty.");
                } else {

                    int value = queue[front];
                    front++;

                    size--;

                    System.out.println("Served token: " + value);
                }

            }
            else if (choice == 3) {

                if (size == 0) {
                    System.out.println("Queue is empty.");
                } else {

                    System.out.println("Queue values (Front to Rear):");

                    int i = front;

                    while (i <= rear) {
                        System.out.println(queue[i]);
                        i++;
                    }
                }

            }
            else if (choice == 4) {

                System.out.println("Current queue size: " + size);

            }
            else if (choice == 5) {

                if (size == 0) {
                    System.out.println("Queue is Empty.");
                } else {
                    System.out.println("Queue is NOT Empty.");
                }

            }
            else if (choice == 6) {

                if (size == capacity) {
                    System.out.println("Queue is Full.");
                } else {
                    System.out.println("Queue is NOT Full.");
                }

            }
            else if (choice == 7) {

                System.out.println("Program exited successfully.");

            }
            else {

                System.out.println("Invalid choice. Please select 1-7.");
            }
        }

        input.close();
    }
}
