import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class player {
    protected static void addPlayer(String name, int age, String photo, String nationality, int overall, String club, String value, String preferredFoot, int weakFoot, int skillMoves, String workRate, String height, String weight, int kitNumber){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "insert into player(Name,Age,Photo,Nationality,Overall,Club,Value,PreferredFoot,WeakFoot,SkillMoves,WorkRate,Height,Weight,KitNumber) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.setString(3,photo);
            pstmt.setString(4,nationality);
            pstmt.setInt(5,overall);
            pstmt.setString(6,club);
//            pstmt.setString(7,club_logo);
            pstmt.setString(7,value);
            pstmt.setString(8,preferredFoot);
            pstmt.setInt(9,weakFoot);
            pstmt.setInt(10,skillMoves);
            pstmt.setString(11,workRate);
            pstmt.setString(12,height);
            pstmt.setString(13,weight);
            pstmt.setInt(14,kitNumber);
            pstmt.executeUpdate();
            System.out.println("Player Added...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
