import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter maximum size of the array: ");
        int capacity = input.nextInt();

        int[] array = new int[capacity];
        int size = 0;

        int choice = 0;

        
        while (choice != 11) {

            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");

            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                if (size == capacity) {
                    System.out.println("Array is full. Cannot add value.");
                } else {
                    System.out.print("Enter book ID to add: ");
                    int value = input.nextInt();
                    array[size] = value;
                    size++;
                    System.out.println("Value added successfully.");
                }

            }
             else if (choice == 2) {
 
                if (size == capacity) {
                    System.out.println("Array is full. Cannot insert value.");
                } else {

                    System.out.print("Enter index: ");
                    int index = input.nextInt();

                    if (index < 0 || index > size) {
                        System.out.println("Invalid index.");
                    } else {

                        System.out.print("Enter book ID: ");
                        int value = input.nextInt();
                        int i = size;

                        while (i > index) {
                            array[i] = array[i - 1];
                            i--;
                        }

                        array[index] = value;
                        size++;

                        System.out.println("Value inserted successfully.");
                    }
                }

            }
            else if (choice == 3) {

                if (size == capacity) {
                    System.out.println("Array is already full.");
                } else {

                    System.out.println("Enter values one by one.");
                    System.out.println("Enter -1 to stop filling.");

                    while (size < capacity) {

                        System.out.print("Enter book ID: ");
                        int value = input.nextInt();

                        if (value == -1) {
                            break;
                        }

                        array[size] = value;
                        size++;
                    }

                    System.out.println("Array filling completed.");
                }

            }
            else if (choice == 4) {

                if (size == 0) {
                    System.out.println("Array is empty. Nothing to delete.");
                } else {

                    size--;

                    System.out.println("Last element deleted successfully.");
                }

            }
            else if (choice == 5) {

                if (size == 0) {
                    System.out.println("Array is empty. Nothing to delete.");
                } else {

                    System.out.print("Enter index to delete: ");
                    int index = input.nextInt();

                    if (index < 0 || index >= size) {
                        System.out.println("Invalid index.");
                    } else {
                        int i = index;

                        while (i < size - 1) {
                            array[i] = array[i + 1];
                            i++;
                        }

                        size--;

                        System.out.println("Value deleted successfully.");
                    }
                }

            }
            else if (choice == 6) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.println("Current elements:");

                    int i = 0;

                    while (i < size) {
                        System.out.println("Index " + i + " = " + array[i]);
                        i++;
                    }
                }

            }
            else if (choice == 7) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.print("Enter value to search: ");
                    int value = input.nextInt();

                    int i = 0;
                    boolean found = false;

                    while (i < size) {

                        if (array[i] == value) {
                            System.out.println(
                                "Value found at index: " + i
                            );
                            found = true;
                        }

                        i++;
                    }

                    if (found == false) {
                        System.out.println("Value does not exist in the array.");
                    }
                }

            }
            else if (choice == 8) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.print("Enter index: ");
                    int index = input.nextInt();

                    if (index < 0 || index >= size) {
                        System.out.println("Invalid index.");
                    } else {

                        System.out.println(
                            "Value at index " + index + " = " + array[index]
                        );
                    }
                }

            }
            else if (choice == 9) {

                if (size == 0) {
                    System.out.println("Array is empty.");
                } else {

                    System.out.print("Enter index to update: ");
                    int index = input.nextInt();

                    if (index < 0 || index >= size) {
                        System.out.println("Invalid index.");
                    } else {

                        System.out.print("Enter new value: ");
                        int newValue = input.nextInt();

                        array[index] = newValue;

                        System.out.println("Value updated successfully.");
                    }
                }

            }
            else if (choice == 10) {

                System.out.println("Current size of array: " + size);

            }
            else if (choice == 11) {

                System.out.println("Program exited successfully.");

            }

            else {

                System.out.println("Invalid choice. Please select 1-11.");
            }
        }
    }
}
