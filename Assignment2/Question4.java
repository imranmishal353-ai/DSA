public class Stack2DArray {

    int[][] stack = new int[5][1];

    int top = -1;

    
    void push(int value) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow.");
            return;
        }

        top++;
        stack[top][0] = value;

        System.out.println(value + " pushed.");
    }

    
    void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow.");
            return;
        }

        System.out.println(stack[top][0] + " popped.");
        top--;
    }

   
    void peek() {

        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top = " + stack[top][0]);
        }
    }

  
    void display() {
     
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i][0] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Stack2DArray stack = new Stack2DArray();

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
