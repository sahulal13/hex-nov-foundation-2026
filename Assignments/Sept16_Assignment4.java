
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Sept16_Assignment4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deque<String> stack = new ArrayDeque<>();
        int choice;
        while (true) {

            System.out.println("Enrollment Menu");
            System.out.println("1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Enter learner name: ");
                    String name = sc.nextLine();

                    stack.push(name);
                    System.out.println("Enrolled: " + name);
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Nothing to undo.");
                    } else {
                        String removed = stack.pop();
                        System.out.println("Undone: " + removed);
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Nothing to undo.");
                    } else {
                        System.out.println("Last enrollment: " + stack.peek());
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid menu choice!");
            }
        }
    }
}

