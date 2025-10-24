import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModifierNoms {

    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/coursjdbc";
        String user = "root";
        String pass = "motDePasse";

        // TODO: créer un Statement avec TYPE_SCROLL_INSENSITIVE et CONCUR_UPDATABLE
        // TODO: exécuter SELECT id, nom FROM utilisateurs
        // TODO: parcourir le ResultSet en sens inverse (afterLast, puis previous)
        //       et remplacer "Ancien" par "Nouveau" avec updateString + updateRow
    }
}
