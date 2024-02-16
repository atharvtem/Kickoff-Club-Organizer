import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Controller {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Controller obj = new Controller();
        System.out.println("What do you want to do?");
        System.out.println("1. Add player");
        System.out.println("2. Remove Player");
        System.out.println("3. View Player");
        int choice = sc.nextInt();
        switch (choice) {
            case (1):
                obj.addPlayer();
                break;
            case (2):
                System.out.println("Remove by:");
                System.out.println("1. ID");
                System.out.println("2. Name");
                int removeChoice = sc.nextInt();
                switch(removeChoice){
                    case 1:
                        obj.removePlayerByID();
                        break;
                    case 2:
                        obj.removePlayerByName();
                        break;
                }
                break;
            case (3):
//                obj.viewPlayer();
        }
    }
//    public void viewPlayer() throws IOException {
//        System.out.println("Enter Name:");
//        String name = br.readLine();
//        System.out.println("Enter age:");
//        int age = sc.nextInt();
//        player.viewPlayer(name,age);
//    }
    public void removePlayerByName() throws IOException {
        System.out.println("Enter Name:");
        String name = br.readLine();
        player.removePlayerByName(name);
    }
    public void removePlayerByID(){
        System.out.println("Enter ID:");
        int ID = sc.nextInt();
        player.removePlayerByID(ID);
    }
    public void addPlayer()throws IOException{
        System.out.println("Enter name:");
        String name = br.readLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter photo:");
        String photo = sc.next();
        System.out.println("Enter nationality:");
        String nationality = br.readLine();
        System.out.println("Enter overall:");
        int overallString = sc.nextInt();
        System.out.println("Enter club:");
        String club = br.readLine();
        System.out.println("Enter value:");
        String value = sc.next();
        System.out.println("Enter preferred foot:");
        String preferredFoot = sc.next();
        System.out.println("Enter weakfoot:");
        int weakFoot = sc.nextInt();
        System.out.println("Enter skill:");
        int skill = sc.nextInt();
        System.out.println("Enter workrate:");
        String workRate = br.readLine();
        System.out.println("Enter height:");
        String height = br.readLine();
        System.out.println("Enter weight:");
        String weight = br.readLine();
        System.out.println("Enter kitnum:");
        int kitNum = sc.nextInt();
        player.addPlayer(name,age,photo,nationality,overallString,club,value, preferredFoot, weakFoot, skill, workRate, height, weight, kitNum);
    }
}
