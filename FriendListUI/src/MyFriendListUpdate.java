import java.sql.*;

public class MyFriendListUpdate {
    public void FriendUpdateName(int friendID, String newName){
        String url = "jdbc:mysql://localhost:3306/MyFriendList";
        String user = "JavaUser";
        String password = "1234567";
        String query = "UPDATE friend SET name = ? WHERE friend_ID = ? ;";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, newName);
            statement.setInt(2, friendID);
            statement.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
