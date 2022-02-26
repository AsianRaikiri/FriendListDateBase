import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyFriendListInput {
        public void FriendInput(String name, String lastName, String sex, String birthDate,
                                  int occupation_ID, String address, int vacation_Budget, String future_Dream) {
                String url = "jdbc:mysql://localhost:3306/MyFriendList";
                String user = "JavaUser";
                String password = "1234567";
                String delim = ", ";
                String query = "INSERT INTO friend (name, lastName, sex, birthDate, occupation_ID, " +
                               "address, vacation_Budget, future_Dream) VALUES(";
                query += name + delim + lastName + delim + sex + delim + birthDate + delim + occupation_ID + delim +
                         address + delim + vacation_Budget + delim + future_Dream + ");";
                try {
                        Connection connection = DriverManager.getConnection(url, user, password);
                        Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                }catch(Exception e){
                        e.printStackTrace();
                }
        }
}
