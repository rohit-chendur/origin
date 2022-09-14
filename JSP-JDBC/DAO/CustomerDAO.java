package com.sonata.Registration.DAO;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.Registration.Model.CustomerBean;






public class CustomerDAO {



   public int registerEmployee(CustomerBean customer) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO customer_details" +
            "  (custName, custEmail, custPhno, custPass) VALUES " +
            " (?, ?, ?, ?);";



       int result = 0;



       Class.forName("com.mysql.cj.jdbc.Driver");



       try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers?useSSL=false", "root", "root@123");



           // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(2, customer.getCustName());
            preparedStatement.setString(3, customer.getCustEmail());
            preparedStatement.setString(4, customer.getCustPhno());
            preparedStatement.setString(5, customer.getCustPass());



           System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();



       } catch (SQLException e) {
            // process sql exception
            e.printStackTrace();
        }
        return result;
    }



}