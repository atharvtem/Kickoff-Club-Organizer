import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class coach {
    protected static void viewCoach(String name){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            PreparedStatement statement = con.prepareStatement("select * from football.coach where short_name = ?");
            statement.setString(1, name);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                int columnid = set.getInt("coach_id");
                String columnname = set.getString("short_name");
                String columnfullname = set.getString("long_name");
                String columnnationality = set.getString("nationality_name");

                System.out.println();
                System.out.println("ID: " + columnid);
                System.out.println("Name: " + columnname);
                System.out.println("League: " + columnfullname);
                System.out.println("Nationality: "+columnnationality);
            }
            con.close();
        }catch(Exception e){
//            e.printStackTrace();
            System.out.println(e);
        }
    }
    protected static void addCoach(String short_name, String long_name,String nationality_name,String url){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "insert into coach(short_name,long_name,nationality_name,face_url) values (?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,short_name);
            pstmt.setString(2,long_name);
            pstmt.setString(3,nationality_name);
            pstmt.setString(4,url);
            pstmt.executeUpdate();
            System.out.println("Coach Added...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected static void removeCoachByName(String name){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "delete from coach where short_name=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.executeUpdate();
            System.out.println("Coach Removed...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected static void removeCoachByID(int ID){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "delete from coach where coach_id=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,ID);
            pstmt.executeUpdate();
            System.out.println("Coach Removed...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
