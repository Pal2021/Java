import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DeleteDB {
    public void deleteDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName = "random4";
            String userName = "root";
            String password = "159Atg45@";

            Connection connection = DriverManager.getConnection(url, userName, password);

            String sql = "DROP DATABASE " + databaseName;

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, databaseName + " Database has been deleted successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
