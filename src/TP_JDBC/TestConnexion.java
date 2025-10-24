import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexion {

    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/coursjdbc";
        String user = "root";
        String pass = "motDePasse";

        // TODO: utiliser un try-with-resources pour ouvrir la connexion,
        // afficher un message de succès, puis les informations sur le SGBD
        // via DatabaseMetaData.
    }
}
