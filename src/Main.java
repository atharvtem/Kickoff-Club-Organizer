import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        authenticate_outer :
        {
            while (true) {
                System.out.println("Authenticate:");
                System.out.println("1.Register");
                System.out.println("2.Login");
                System.out.println("3.Exit");
                int user = sc.nextInt();
                switch (user) {
                    case 1:
                        Controller.register();
                        break;
                    case 2:

                        while(true) {
                            if (Controller.login()) {
                                System.out.println("What do you want to do?");
                                System.out.println("1. Players");
                                System.out.println("2. Clubs");
                                System.out.println("3. Coaches");

                                int mainchoice = sc.nextInt();
                                switch (mainchoice) {
                                    case 1:
                                        System.out.println("What do you want to do?");
                                        System.out.println("1. Add player");
                                        System.out.println("2. Remove Player");
                                        System.out.println("3. View Player");
                                        int choice = sc.nextInt();
                                        switch (choice) {
                                            case (1):
                                                Controller.addPlayer();
                                                break;
                                            case (2):
                                                System.out.println("Remove by:");
                                                System.out.println("1. ID");
                                                System.out.println("2. Name");
                                                int removeChoice = sc.nextInt();
                                                switch (removeChoice) {
                                                    case 1:
                                                        Controller.removePlayerByID();
                                                        break;
                                                    case 2:
                                                        Controller.removePlayerByName();
                                                        break;
                                                }
                                                break;
                                            case (3):
                                                Controller.viewPlayer();
                                                break;
                                        }
                                    case 2:
                                        System.out.println("What do you want to do?");
                                        System.out.println("1. Add Club");
                                        System.out.println("2. Remove Club");
                                        System.out.println("3. View Club");
                                        choice = sc.nextInt();
                                        switch (choice) {
                                            case (1):
                                                Controller.addClub();
                                                break;
                                            case (2):
                                                System.out.println("Remove by:");
                                                System.out.println("1. ID");
                                                System.out.println("2. Name");
                                                int removeChoice = sc.nextInt();
                                                switch (removeChoice) {
                                                    case 1:
                                                        Controller.removeClubByID();
                                                        break;
                                                    case 2:
                                                        Controller.removeClubByName();
                                                        break;
                                                }
                                            case (3):
                                                Controller.viewClub();
                                                break;
                                        }
                                    case 3:
                                        System.out.println("What do you want to do?");
                                        System.out.println("1. Add Coach");
                                        System.out.println("2. Remove Coach");
                                        System.out.println("3. View Coach");
                                        choice = sc.nextInt();
                                        switch (choice) {
                                            case (1):
                                                Controller.addCoach();
                                                break;
                                            case (2):
                                                System.out.println("Remove by:");
                                                System.out.println("1. ID");
                                                System.out.println("2. Name");
                                                int removeChoice = sc.nextInt();
                                                switch (removeChoice) {
                                                    case 1:
                                                        Controller.removeCoachByID();
                                                        break;
                                                    case 2:
                                                        Controller.removeCoachByName();
                                                        break;
                                                }
                                            case (3):
                                                Controller.viewCoach();
                                                break;
                                        }
                                }
                            } else
                                break;
                        }
                    case 3:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                        break authenticate_outer;
                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            }
        }
    }
}
