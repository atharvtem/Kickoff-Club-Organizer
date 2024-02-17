import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
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
                switch(removeChoice){
                    case 1:
                        Controller.removePlayerByID();
                        break;
                    case 2:
                        Controller.removePlayerByName();
                        break;
                }
                break;
            case (3):
//                obj.viewPlayer();
        }
    }
}