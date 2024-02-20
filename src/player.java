import java.sql.*;

public class player {
    protected static void viewPlayer(String name, int age){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = ("select * from player");
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while (set.next()) {
                int columnid = set.getInt(1);
                String columnname = set.getString(2);
                int columnage = set.getInt(3);
                String columnnationality = set.getString(4);
                int columnoverall = set.getInt(5);
                String columnclub = set.getString(6);
                String columnvalue = set.getString(7);
                String columnfoot = set.getString(8);
                int columnweakfoot = set.getInt(9);
                int columnskill = set.getInt(10);
                String columnworkrate = set.getString(11);
                String columnHeight = set.getString(12);
                String columnWeight = set.getString(13);
                int columnkitnum = set.getInt(14);
                System.out.println("ID: " + columnid);
                System.out.println("Name: " + columnname);
                System.out.println("Age: " + columnage);
                System.out.println("Nationality: "+columnnationality);
                System.out.println("Overall: " + columnoverall);
                System.out.println("Club: " + columnclub);
                System.out.println("Value:" + columnvalue);
                System.out.println("Strong Foot: " + columnfoot);
                System.out.println("Weak Foot: " + columnweakfoot);
                System.out.println("Skill: " + columnskill);
                System.out.println("WorkRate: " + columnworkrate);
                System.out.println("Height: " + columnHeight);
                System.out.println("Weight: " + columnWeight);
                System.out.println("Kit Number: " + columnkitnum);
            }
            con.close();
        }catch(Exception e){
//            e.printStackTrace();
            System.out.println(e);
        }
    }
    protected static void viewPLayer(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
//            DBTablePrinter.printTable(con, "employees");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
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
