import java.sql.*;

public class MyFriendListDelete {
    public void FriendDeleteByID(int friend_ID){
        String url = "jdbc:mysql://localhost:3306/MyFriendList";
        String user = "JavaUser";
        String password = "1234567";
        String query = "DELETE FROM friend WHERE friend_ID = ?";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, friend_ID);
            int affectedRows = statement.executeUpdate();
            System.out.println("Rows affected: " + affectedRows);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
