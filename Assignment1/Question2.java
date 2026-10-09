import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter maximum capacity of stack: ");
        int capacity = input.nextInt();
        int[] stack = new int[capacity];
        int top = -1;
         int choice = 0;
        while (choice != 7) {

            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {

                if (top == capacity - 1) {
                    System.out.println("Stack Overflow! Stack is full.");
                } else {

                    System.out.print("Enter value to push: ");
                    int value = input.nextInt();

                    top++;
                    stack[top] = value;

                    System.out.println("Value pushed successfully.");
                }

            }
            else if (choice == 2) {

                if (top == -1) {
                    System.out.println("Stack Underflow! Stack is empty.");
                } else {

                    int value = stack[top];

                    top--;

                    System.out.println("Popped value: " + value);
                }

            }
            else if (choice == 3) {

                if (top == -1) {
                    System.out.println("Stack is empty.");
                } else {

                    System.out.println("Stack values (Top to Bottom):");

                    int i = top;

                    while (i >= 0) {
                        System.out.println(stack[i]);
                        i--;
                    }
                }

            }
            else if (choice == 4) {

                int size = top + 1;

                System.out.println("Current stack size: " + size);

            }
            else if (choice == 5) {

                if (top == -1) {
                    System.out.println("Stack is Empty.");
                } else {
                    System.out.println("Stack is NOT Empty.");
                }

            }
            else if (choice == 6) {

                if (top == capacity - 1) {
                    System.out.println("Stack is Full.");
                } else {
                    System.out.println("Stack is NOT Full.");
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
