import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CreateDB {
    public void createDatabases() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName = "JDBC_java";
            String userName = "root";
            String password = "159Atg45@";
    
            Connection connection = DriverManager.getConnection(url, userName, password);
    
            String sql = "CREATE DATABASE " + databaseName;
    
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
    
            JOptionPane.showMessageDialog(null, databaseName + " Database has been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTables() {
        try {
            String url = "jdbc:mysql://localhost:3306/JDBC_java";
            String userName = "root";
            String password = "159Atg45@";
    
            Connection connection = DriverManager.getConnection(url, userName, password);
    
            String sql = "CREATE TABLE students(id INT(3), s_name VARCHAR(30), s_email VARCHAR(200))";
    
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
    
            JOptionPane.showMessageDialog(null, "Tables have been created successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertvalues() {
        try {
            String url = "jdbc:mysql://localhost:3306/JDBC_java";
            String userName = "root";
            String password = "159Atg45@";
    
            Connection connection = DriverManager.getConnection(url, userName, password);
    
            String sql = "INSERT INTO students VALUES (1, 'Prashant pal', 'prashantpal200013@gmail.com'), " +
            "(2, 'John Doe', 'johnDoe@yahoo.com'), " +
            "(3, 'Jane Smith', 'jane_smith@gmail.com')";
    
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
    
            JOptionPane.showMessageDialog(null, "Values inserted successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateValues() {
        try {
            String url = "jdbc:mysql://localhost:3306/JDBC_java";
            String userName = "root";
            String password = "159Atg45@";
    
            Connection connection = DriverManager.getConnection(url, userName, password);
    
            String sql = "UPDATE students SET s_name = 'smith', s_email = 'smith@example.com' WHERE id = 1";
    
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(sql);
            statement.close();
    
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Values have been updated successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No records were updated", "System Message", JOptionPane.INFORMATION_MESSAGE);
            }
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
    
    public void readValues() {

        try {
            String url = "jdbc:mysql://localhost:3306/JDBC_java";
            String userName = "root";
            String password = "159Atg45@";

            Connection connection = DriverManager.getConnection(url, userName, password);

            String sql = "SELECT * FROM students";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            StringBuilder result = new StringBuilder("Student Records:\n");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("s_name");
                String email = resultSet.getString("s_email");
                result.append("ID: ").append(id).append(", Name: ").append(name).append(", Email: ").append(email).append("\n");
            }

            resultSet.close();
            statement.close();

            JOptionPane.showMessageDialog(null, result.toString(), "System Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteValues() {
        try {
            String url = "jdbc:mysql://localhost:3306/JDBC_java";
            String userName = "root";
            String password = "159Atg45@";
    
            Connection connection = DriverManager.getConnection(url, userName, password);
    
            String sql = "DELETE FROM students WHERE id IN " +
                         "(SELECT id FROM " +
                         "(SELECT id, ROW_NUMBER() OVER (PARTITION BY id ORDER BY id) AS row_num FROM students) AS temp " +
                         "WHERE row_num > 1)";
    
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(sql);
            statement.close();
    
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Duplicate IDs have been deleted successfully", "System Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No duplicate IDs found", "System Message", JOptionPane.INFORMATION_MESSAGE);
            }
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
