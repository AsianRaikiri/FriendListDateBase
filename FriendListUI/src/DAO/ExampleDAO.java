package DAO;

import CoreClasses.Friend;

import javax.swing.plaf.nimbus.State;
import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class ExampleDAO {
    private Connection connection;
    public ExampleDAO() throws Exception{
        Properties login = new Properties();
        login.load(new FileInputStream("../../../loginInformation.properties"));

        String user = login.getProperty("user");
        String password = login.getProperty("password");
        String url = login.getProperty("url");

        connection = DriverManager.getConnection(url, user, password);
        System.out.println("connected successfully");
    }
    public List<Friend> getAllFriends() throws Exception{
        List<Friend> list = new ArrayList<>();
        Statement statement = null;
        ResultSet result = null;
        try{
            statement = connection.createStatement();
            result = statement.executeQuery("SELECT * FROM friend");

            while(result.next()){
                Friend tempFriend = convertRowToFriend(result);
                list.add(tempFriend);
            }
            return list;
        }
        finally {
            close(statement, result);
        }
    }
    public List<Friend> searchFriend(String name) throws Exception{
        List<Friend> list = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet result = null;

        try{
            name +="%";
            statement = connection.prepareStatement("SELECT * FROM friend WHERE name like ?");
            statement.setString(1,name);
            result = statement.executeQuery();
            while(result.next()){
                Friend tempFriend = convertRowToFriend(result);
                list.add(tempFriend);
            }
            return list;
        }
        finally {
            close(statement, result);
        }
    }
    private static void close(Connection connection, Statement statement, ResultSet result) throws SQLException {
        if(result != null){
            result.close();
        }
        if(statement != null){
            statement.close();
        }
        if(connection != null){
            connection.close();
        }
    }
    private void close(Statement statement, ResultSet result) throws SQLException{
        close(null, statement, result);
    }
    private Friend convertRowToFriend(ResultSet result) throws SQLException{
        int friend_ID = result.getInt("friend_ID");
        String name = result.getString("name");
        String last_Name = result.getString("last_Name");
        String sex = result.getString("sex");
        Date birthDate = result.getDate("birthDate");
        int occupation_ID = result.getInt("occupation_ID");
        String address = result.getString("address");
        int vacation_Budget = result.getInt("vacation_Budget");
        String future_Dream = result.getString("future_Dream");
        Friend tempFriend = new Friend(friend_ID, name, last_Name, sex, birthDate,
                                       occupation_ID, address, vacation_Budget, future_Dream);
        return tempFriend;
    }
}
