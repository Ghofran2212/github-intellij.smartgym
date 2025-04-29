package sport.utilisateur.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private String url="jdbc:mysql://localhost:3306/samartgym";
    private String userName="root";
    private String pwd="";
    private Connection cnx;
    private static MyConnection instance;

    public MyConnection(){
        try {
            cnx =  DriverManager.getConnection(url,userName,pwd);
            System.out.println("Connexion établie...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getCnx() {
        return cnx;
    }

    public static MyConnection getInstance(){
        if(instance == null){
            instance = new MyConnection();
        }
        return instance;
    }

}
