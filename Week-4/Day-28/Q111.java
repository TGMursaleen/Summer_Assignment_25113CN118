import java.util.Scanner;
import java.util.HashMap;

class Ticket {
    String movieName;
    int totalSeats;
    int bookedSeats;

    Ticket(String movieName, int totalSeats) {
        this.movieName = movieName;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }
}

public class Q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Ticket> eventMap = new HashMap<>();
        boolean exit = false;

        System.out.println("=== TICKET BOOKING SYSTEM ===");

        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Register New Event/Movie");
            System.out.println("2. Book Tickets");
            System.out.println("3. Check Availability");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid selection. Please enter a valid menu index.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Event ID: ");
                    int id = sc.nextInt();
                    if (eventMap.containsKey(id)) {
                        System.out.println("Error: Event ID already exists.");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Total Capacity: ");
                    int capacity = sc.nextInt();
                    eventMap.put(id, new Ticket(name, capacity));
                    System.out.println("Event registered successfully.");
                    break;

                case 2:
                    System.out.print("Enter Event ID: ");
                    int bookId = sc.nextInt();
                    if (eventMap.containsKey(bookId)) {
                        Ticket t = eventMap.get(bookId);
                        System.out.print("Enter number of tickets to book: ");
                        int qty = sc.nextInt();
                        if (t.bookedSeats + qty <= t.totalSeats) {
                            t.bookedSeats += qty;
                            System.out.println("Booking confirmed! " + qty + " tickets for " + t.movieName);
                        } else {
                            System.out.println("Error: Not enough seats available.");
                        }
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Event ID: ");
                    int checkId = sc.nextInt();
                    if (eventMap.containsKey(checkId)) {
                        Ticket t = eventMap.get(checkId);
                        System.out.println("Event: " + t.movieName + " | Available: " + (t.totalSeats - t.bookedSeats));
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting booking system. Goodbye.");
                    break;

                default:
                    System.out.println("Invalid selection.");
            }
        }
        sc.close();
    }
}