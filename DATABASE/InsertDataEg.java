package DATABASE;
import java.sql.*;

import java.util.Scanner;

public class InsertDataEg {
    public static void main(String[] args) {
        try {
            // 1. Load driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "system";
            String pass = "Roshini#1";
            // 2. Connect
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("db connected");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter person id:");
            int pid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter person name:");
            String pname = sc.nextLine();
            System.out.println("Enter person age:");
            int age = sc.nextInt();
            // 3. Correct SQL
            String query = "insert into person (pid, pname, age) values (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1,pid);
            pstmt.setString(2, pname);
            pstmt.setInt(3, age);
            int rows=pstmt.executeUpdate();

            System.out.println(rows+"Record inserted...");
            con.commit();
            con.close();

        } catch (Exception e) {
            e.printStackTrace(); // important!
        }
    }
}