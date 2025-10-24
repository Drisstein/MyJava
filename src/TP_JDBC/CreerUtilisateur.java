import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreerUtilisateur {

    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/coursjdbc";
        String user = "root";
        String pass = "motDePasse";

        // TODO: lire nom, age, email au clavier
        // TODO: ouvrir une connexion avec try-with-resources
        // TODO: préparer un INSERT INTO utilisateurs(nom, age, email) VALUES (?, ?, ?)
        //       avec l'option Statement.RETURN_GENERATED_KEYS
        // TODO: exécuter l'INSERT puis récupérer la clé générée avec getGeneratedKeys()
        // TODO: afficher l'id généré
    }
}
