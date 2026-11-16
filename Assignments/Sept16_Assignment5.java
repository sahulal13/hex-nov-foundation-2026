
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Sept16_Assignment5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] seats = new String[3];
        Queue<String> waitlist = new ArrayDeque<>();

        while (true) {

            System.out.println("BATCH WAITLIST MENU");
            System.out.println("1. Add Learner");
            System.out.println("2. Drop Learner");
            System.out.println("3. Display Batch Details");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice;

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:

                    System.out.print("Enter learner name: ");
                    String name = sc.nextLine().trim();

                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }

                    boolean enrolled = false;
                    for (int i = 0; i < seats.length; i++) {

                        if (seats[i] == null) {
                            seats[i] = name;
                            enrolled = true;

                            System.out.println(name + " enrolled successfully!");
                            break;
                        }
                    }

                    if (!enrolled) {
                        waitlist.offer(name);
                        System.out.println(name + " added to waitlist.");
                    }

                    break;

                case 2:
                    System.out.print("Enter learner name to drop: ");
                    String dropout = sc.nextLine().trim();
                    boolean found = false;

                    for (int i = 0; i < seats.length; i++) {
                        if (seats[i] != null &&
                                seats[i].equalsIgnoreCase(dropout)) {
                            found = true;

                            System.out.println(seats[i] + " dropped out.");

                            seats[i] = null;


                            if (!waitlist.isEmpty()) {

                                seats[i] = waitlist.poll();

                                System.out.println(
                                        seats[i] + " got the vacant seat."
                                );

                            } else {
                                System.out.println("Seat is now vacant.");
                            }
                            break;
                        }
                    }


                    if (!found) {
                        String waitingLearner = null;

                        for (String learner : waitlist) {
                            if (learner.equalsIgnoreCase(dropout)) {
                                waitingLearner = learner;
                                break;
                            }
                        }

                        if (waitingLearner != null) {
                            waitlist.remove(waitingLearner);
                            found = true;
                            System.out.println(
                                    waitingLearner + " removed from waitlist."
                            );
                        }
                    }

                    if (!found) {
                        System.out.println(
                                "Learner not found in batch or waitlist."
                        );
                    }
                    break;

                case 3:

                    System.out.println("\n===== BATCH DETAILS =====");
                    System.out.println(
                            "Seats: " + Arrays.toString(seats)
                    );

                    System.out.println(
                            "Waiting List: " + waitlist
                    );

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
