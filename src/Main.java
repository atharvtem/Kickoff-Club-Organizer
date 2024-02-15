import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            //System.out.println(con);
            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connection created....");
            }
            String q = "insert into test_info values (?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            String name = sc.next();
            pstmt.setInt(id);
            pstmt.setString(name);
            pstmt.executeUpdate(q);
            con.close();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }


    }
}
