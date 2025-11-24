package com.revature.jdbcdemo;

import java.sql.*;

public class JdbcStmt01 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        // STEP 1. LOAD THE DRIVER -- OPTIONAL
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            // STEP 2. CREATE THE CONNECTION
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root","admin123");
            // STEP 3. - CREATE THE STATEMENT OBJ
                statement=connection.createStatement();
                String selectQuery="select * from contacts";
            // STEP 4. EXECUTE THE QUERY AND COLLECT THE RESULT IN RESULT SET
                resultSet=statement.executeQuery(selectQuery);
            // STEP 5. PROCESS THE RESULTSET
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+" , "
                        +resultSet.getString(2).toUpperCase()+" , " +resultSet.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Database Connected...");
        }
    }

