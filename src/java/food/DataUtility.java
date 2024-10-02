package food;

import java.io.*;
import java.sql.*;

public class DataUtility {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure correct driver class
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

//    private static final String DB_URL = "jdbc:mysql://103.115.19.246:3306/jatingup_food_point";
//    private static final String USER = "jatingup_food_point_user";
//    private static final String PASSWORD = "Vishal@124";
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/food_point";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static int executeDML(String sql) {
        int result = 0;
         System.out.println("enter in the method");
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement st = con.createStatement()) {
             System.out.println(st);
            result = st.executeUpdate(sql);
             System.out.println(result);
        } catch (SQLException e) {
             System.out.println("catch block");
            e.printStackTrace();
        }

        return result;
    }

    public static ResultSet executeDQL(String sql) {
        ResultSet rs = null;
        Connection con = null;

        try {
            con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
