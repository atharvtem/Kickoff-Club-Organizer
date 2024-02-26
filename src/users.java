import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class users {
    protected static PasswordHashing obj = new PasswordHashing();
    static Scanner sc = new Scanner(System.in);

    protected static void registration(String username,String password){
        String hashedPassword = obj.hashPassword(password);
        String salt = SaltGenerator.generateSalt();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            String q = "insert into users(username,hashed_password,salt) values (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,username);
            pstmt.setString(2,hashedPassword);
            pstmt.setString(3,salt);
            pstmt.executeUpdate();
            System.out.println("User Added...");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    protected static boolean verifylogin(String testusername, String testpassword){
        String columnname = null;
        String hashedpassword=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/football","root", "admin");
            PreparedStatement statement = con.prepareStatement("select * from football.users where username = ?");
            statement.setString(1, testusername);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                columnname = set.getString(2);
                hashedpassword = set.getString(3);
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
        if (testusername.equals(columnname) && obj.verifyPassword(testpassword, hashedpassword)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid credentials");
            return false;
        }
    }
}
