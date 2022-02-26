import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyFriendListUpdate {
    public void FriendUpdateName(int friendID, String newName){
        String url = "jdbc:mysql://localhost:3306/MyFriendList";
        String user = "JavaUser";
        String password = "1234567";
        String query = "UPDATE friend SET name = " + newName + "WHERE friend_ID  " + friendID + ";";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
