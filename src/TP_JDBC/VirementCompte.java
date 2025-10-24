import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class VirementCompte {

    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/coursjdbc";
        String user = "root";
        String pass = "motDePasse";

        Scanner scanner = new Scanner(System.in);

        // TODO: lire idCompteSource, idCompteCible et montant au clavier

        // TODO: ouvrir une connexion, désactiver l'auto-commit,
        //       exécuter les deux UPDATE dans un try,
        //       faire commit si tout va bien, rollback en cas d'erreur.
    }
}
