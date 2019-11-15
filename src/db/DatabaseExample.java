package db;

import java.sql.*;

public class DatabaseExample {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:sqlite:Z:\\Общая преподавателей\\Милых Светозар\\brunoyam_1410\\database.db";
        Connection connection = DriverManager.getConnection(url);
        PreparedStatement statement = connection.prepareStatement("create TABLE if not EXISTS Clients (id integer PRIMARY KEY AUTOINCREMENT, name text, phone text);");
        statement.execute();

        statement = connection.prepareStatement("insert into Clients (name, phone) VALUES ('Petr', '+782138238232');");
        statement.execute();

        statement = connection.prepareStatement("select * from Clients;");
        ResultSet cursor = statement.executeQuery();
        while(cursor.next()) {
            System.out.println(cursor.getString(2));
        }

        connection.close();
    }
}
