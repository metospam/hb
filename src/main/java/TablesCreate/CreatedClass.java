package TablesCreate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatedClass {

    private static final String SQL_CREATE_users = ("CREATE TABLE users"
            + "("
            + " ID serial,"
            + " userName varchar(100) NOT NULL,"
            + " address varchar(100) NOT NULL,"
            + " PRIMARY KEY (ID)"
            + ")");

    private static final String SQL_CREATE_details = ("CREATE TABLE details"
            + "("
            + "id serial,"
            + "account varchar(100) not null,"
            + "bankName varchar(100) not null,"
            + "userId int,"
            + "FOREIGN KEY (userId int) references users(id),"
            + "primary key (id)"
            + ")");

    public static void main(String[] args) {


        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres", "postgres", "1d107");

             Statement statement = conn.createStatement()) {

            statement.execute(SQL_CREATE_users);
            statement.execute(SQL_CREATE_details);

            System.out.println("Tables was created.");

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
