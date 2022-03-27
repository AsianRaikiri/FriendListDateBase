import java.sql.*;

public class MyFriendListInput {
        public void FriendInput(String name, String lastName, String sex, String birthDate,
                                  int occupation_ID, String address, int vacation_Budget, String future_Dream) {
                String url = "jdbc:mysql://localhost:3306/MyFriendList";
                String user = "JavaUser";
                String password = "1234567";
                String delim = ", ";
                String query = "INSERT INTO friend (name, lastName, sex, birthDate, occupation_ID, " +
                               "address, vacation_Budget, future_Dream) VALUES(?, ?, ?, ?, ?, ?, ?, ?); ";
                try {
                        Connection connection = DriverManager.getConnection(url, user, password);
                        PreparedStatement statement = connection.prepareStatement(query);
                        statement.setString(1, name);
                        statement.setString(2, lastName);
                        statement.setString(3, sex);
                        statement.setString(4, birthDate);
                        statement.setInt(5, occupation_ID);
                        statement.setString(6, address);
                        statement.setInt(7, vacation_Budget);
                        statement.setString(8, future_Dream);
                       statement.executeUpdate();
                }catch(Exception e){
                        e.printStackTrace();
                }
        }
}
