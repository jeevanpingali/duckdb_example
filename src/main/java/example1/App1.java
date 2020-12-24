package example1;

import java.sql.*;

public class App1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.duckdb.DuckDBDriver");
        Connection conn = DriverManager.getConnection("jdbc:duckdb:");
        Statement stmt = conn.createStatement();
        boolean execute = stmt.execute("SELECT 42");
        System.out.println("execute: " + execute);
        stmt.close();
        conn.close();
    }
}
