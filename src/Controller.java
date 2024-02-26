import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Controller {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    protected static boolean login(){
        System.out.println("Enter username:");
        String username = sc.next();
        System.out.println("Enter Password:");
        String password = sc.next();
        return users.verifylogin(username,password);
    }

    protected static void register(){
        System.out.println("Create Username");
        String username = sc.next();
        System.out.println("Create Passowrd");
        String password = sc.next();
        users.registration(username,password);
    }
    public static void viewCoach() throws IOException {
        System.out.println("Enter Short Name:");
        String name = br.readLine();
        coach.viewCoach(name);
    }
    public static void addCoach()throws IOException{
        System.out.println("Enter Short Name:");
        String name = br.readLine();
        System.out.println("Enter Long Name:");
        String longname = br.readLine();
        System.out.println("Enter nationality");
        String natioanlity = br.readLine();
        System.out.println("Enter Photo URL:");
        String url = br.readLine();
        coach.addCoach(name,longname,natioanlity,url);
    }
    public static void removeCoachByName() throws IOException {
        System.out.println("Enter short Name:");
        String name = br.readLine();
        coach.removeCoachByName(name);
    }
    public static void removeCoachByID(){
        System.out.println("Enter coach ID:");
        int ID = sc.nextInt();
        coach.removeCoachByID(ID);
    }
    public static void viewClub() throws IOException {
        System.out.println("Enter Name:");
        String name = br.readLine();
        club.viewClub(name);
    }
    public static void addClub()throws IOException{
        System.out.println("Enter Club Name:");
        String name = br.readLine();
        System.out.println("Enter League Name:");
        String league = br.readLine();
        System.out.println("Enter natioanlity:");
        String natioanlity = br.readLine();
        System.out.println("Enter Overall:");
        int overall = sc.nextInt();
        System.out.println("Enter home stadium:");
        String homeground = br.readLine();
        System.out.println("Enter CLub Worth: ");
        String worth = br.readLine();
        club.addClub(name,league,natioanlity,overall,homeground,worth);
    }
    public static void removeClubByName() throws IOException {
        System.out.println("Enter club Name:");
        String name = br.readLine();
        club.removeClubByName(name);
    }
    public static void removeClubByID(){
        System.out.println("Enter club ID:");
        int ID = sc.nextInt();
        club.removeClubByID(ID);
    }
    public static void viewPlayer() throws IOException {
        System.out.println("Enter Name:");
        String name = br.readLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        player.viewPlayer(name,age);
    }
    public static void removePlayerByName() throws IOException {
        System.out.println("Enter Name:");
        String name = br.readLine();
        player.removePlayerByName(name);
    }
    public static void removePlayerByID(){
        System.out.println("Enter ID:");
        int ID = sc.nextInt();
        player.removePlayerByID(ID);
    }
    public static void addPlayer()throws IOException{
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
