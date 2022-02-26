import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyFriendListDelete {
    public void FriendDelete(int friend_ID){
        String url = "jdbc:mysql://localhost:3306/MyFriendList";
        String user = "JavaUser";
        String password = "1234567";
        String query = "DELETE FROM friend WHERE friend_ID = ";
        query += friend_ID + ";";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
