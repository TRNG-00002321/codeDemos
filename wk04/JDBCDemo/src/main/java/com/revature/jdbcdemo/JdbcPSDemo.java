package com.revature.jdbcdemo;

import java.sql.*;


public class JdbcPSDemo {
    static Connection connection=null;
    static PreparedStatement preparedStatement=null;
    static  ResultSet resultSet=null;
    public static void main(String[] args) {
        try {
             connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root","admin123");
             String insertQuery="insert into contacts(name,email,phone) values(?,?,?)";
             preparedStatement=connection.prepareStatement(insertQuery);
            preparedStatement.setString(1,"Jasdhir");
            preparedStatement.setString(2,"jasdhir1@email.com");
            preparedStatement.setString(3,"1234567890");
            preparedStatement.execute();
            preparedStatement.close();

            String selectQuery="select * from contacts where name like ?";
            preparedStatement=connection.prepareStatement(selectQuery);
            preparedStatement.setString(1,"Perry");

            resultSet=preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+" , "
                        +resultSet.getString(2).toUpperCase()+" , " +resultSet.getString("email"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
