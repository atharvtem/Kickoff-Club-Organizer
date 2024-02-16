import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class player {
//    protected static void viewPlayer(String name, int age){
//        try(PreparedStatement preparedStatement = con.prepareStatement(selectQuery)){
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
//            String q = "select * from player where Name=? and age=?";
////            PreparedStatement pstmt = con.prepareStatement(q);
//            PreparedStatement preparedStatement = null;
//            ResultSet resultSet = preparedStatement.executeQuery(q);
////            pstmt.setString(1,name);
////            pstmt.setInt(2,age);
//            while (resultSet.next()) {
//                // Retrieve data from the result set
//                int id = resultSet.getInt("id");
//                String columnName1 = resultSet.getString("column1");
//                // Retrieve other columns as needed
//
//                // Process or print the retrieved data
//                System.out.println("ID: " + id + ", Column1: " + columnName1);
//            }
////            System.out.println("Player Removed...");
//            con.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
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
    protected static void removePlayerByName(String name){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "delete from player where Name=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.executeUpdate();
            System.out.println("Player Removed...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    protected static void removePlayerByID(int ID){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "delete from player where ID=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,ID);
            pstmt.executeUpdate();
            System.out.println("Player Removed...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
