import java.util.Scanner;
public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Going in addplayer class");
        Controller obj = new Controller();
        obj.addPlayer();
    }
    public void addPlayer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter photo:");
        String photo = sc.next();
        System.out.println("Enter nationality:");
        String nationality = sc.next();
        System.out.println("Enter overall:");
        int overallString = sc.nextInt();
        System.out.println("Enter club:");
        String club = sc.next();
        System.out.println("Enter value:");
        String value = sc.next();
        System.out.println("Enter preferred foot:");
        String preferredFoot = sc.next();
        System.out.println("Enter weakfoot:");
        int weakFoot = sc.nextInt();
        System.out.println("Enter skill:");
        int skill = sc.nextInt();
        System.out.println("Enter workrate:");
        String workRate = sc.next();
        System.out.println("Enter height:");
        String height = sc.next();
        System.out.println("Enter weight:");
        String weight = sc.next();
        System.out.println("Enter kitnum:");
        int kitNum = sc.nextInt();
        player.addPlayer(name,age,photo,nationality,overallString,club,value, preferredFoot, weakFoot, skill, workRate, height, weight, kitNum);
    }
}
