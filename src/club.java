import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class club {
    protected static void addClub(String team_name,String league_name, String nationality_name, int overall, String home_stadium, String club_worth){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "insert into club(team_name,league_name,nationality_name,overall,home_stadium,club_worth_eur) values (?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,team_name);
            pstmt.setString(2,league_name);
            pstmt.setString(3,nationality_name);
            pstmt.setInt(4,overall);
            pstmt.setString(5,home_stadium);
            pstmt.setString(6,club_worth);
            pstmt.executeUpdate();
            System.out.println("Club Added...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected static void removeClubByName(String name){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "delete from club where team_name=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.executeUpdate();
            System.out.println("Club Removed...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected static void removeClubByID(int ID){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "delete from club where team_id=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,ID);
            pstmt.executeUpdate();
            System.out.println("Club Removed...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}