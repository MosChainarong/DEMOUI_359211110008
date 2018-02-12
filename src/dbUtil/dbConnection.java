package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    private static final String SQCONN = "jdbc:sqlite:src/school.sqlite.db";
    private static DriverManager DriveManager;

    public static Connection getConnrction() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriveManager.getConnection(SQCONN);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null ;
    }//getCon
}//class
