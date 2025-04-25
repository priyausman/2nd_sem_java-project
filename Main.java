package smartdoorlock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDatabase db = new UserDatabase();
        SmartLock lock = new SmartLock(db);

        System.out.println("Welcome to Smart Door Lock System");
        System.out.println("Choose method: 1. Fingerprint  2. PIN");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            System.out.print("Enter fingerprint (e.g., Alice): ");
            String fingerprint = sc.nextLine();
            lock.loginWithFingerprint(fingerprint);
        } else if (choice == 2) {
            System.out.print("Enter PIN (e.g.,4561): ");
            String pin = sc.nextLine();
            lock.loginWithPIN(pin);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
