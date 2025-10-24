import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExplorerBase {

    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/coursjdbc";
        String user = "root";
        String pass = "motDePasse";

        // TODO: ouvrir une connexion et récupérer DatabaseMetaData
        // TODO: lister les tables du schéma courant puis, pour chaque table,
        //       lister les colonnes (nom + type).
    }
}
