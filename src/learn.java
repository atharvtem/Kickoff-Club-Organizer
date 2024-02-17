import java.io.FileInputStream;
import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class learn {
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
            String pic = "insert into test_img(pic) values(?)";
            PreparedStatement pstmt = con.prepareStatement(pic);
            FileInputStream fis = new FileInputStream("\"C:\\Blog\\Blog 5\\dineyhotstar.jpg\"");
            pstmt.setBinaryStream(1,fis,fis.available());
//            String q = "insert into test_info(name) values (?)";
//            PreparedStatement pstmt = con.prepareStatement(q);
//            Scanner sc = new Scanner(System.in);
//            int id = sc.nextInt();
//            String name = sc.next();
//            pstmt.setInt(id);
//            pstmt.setString(4,name);
            pstmt.executeUpdate();
            System.out.println("Done...");
            con.close();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }


    }
}
