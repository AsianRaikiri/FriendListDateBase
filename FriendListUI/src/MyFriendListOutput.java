import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Generating Output Material, depending on Query Input
public class MyFriendListOutput {
    public String FriendOutputAll(){
        String url = "jdbc:mysql://localhost:3306/MyFriendList";
        String user = "JavaUser";
        String password = "1234567";
        String query = "SELECT * FROM friend";
        String friendOutput;
        String friendReturn = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                friendOutput = "";
                for(int i = 1; i<= 9; i++) {
                    friendOutput += resultSet.getString(i) + " : ";
                    friendReturn += resultSet.getString(i) + " : ";
                }
                friendReturn += "\n";
                System.out.println(friendOutput);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return friendReturn;
    }
}
