import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Are we there yet? (Yes/No)");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("yes")) {
                System.out.println("Great! We're there");
                break;
            } else if (response.equals("no")) {
                System.out.println("okay, keep going.");

            } else {
                System.out.println("invalid response");
            }
        }
    }
}

