import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ApplicationConsole {

    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/coursjdbc";
        String user = "root";
        String pass = "motDePasse";

        UtilisateurDao dao = new UtilisateurDaoJdbc(url, user, pass);
        Scanner scanner = new Scanner(System.in);

        boolean continuer = true;
        while (continuer) {
            afficherMenu();
            String choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    listerUtilisateurs(dao);
                    break;
                case "2":
                    creerUtilisateur(dao, scanner);
                    break;
                case "3":
                    rechercherParId(dao, scanner);
                    break;
                case "4":
                    mettreAJourUtilisateur(dao, scanner);
                    break;
                case "5":
                    supprimerUtilisateur(dao, scanner);
                    break;
                case "0":
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }

        System.out.println("Au revoir !");
    }

    private static void afficherMenu() {
        System.out.println("==== Menu ====");
        System.out.println("1) Lister les utilisateurs");
        System.out.println("2) Créer un utilisateur");
        System.out.println("3) Rechercher un utilisateur par id");
        System.out.println("4) Mettre à jour un utilisateur");
        System.out.println("5) Supprimer un utilisateur");
        System.out.println("0) Quitter");
        System.out.print("Votre choix : ");
    }

    private static void listerUtilisateurs(UtilisateurDao dao) {
        // TODO: appeler dao.findAll() et afficher la liste
    }

    private static void creerUtilisateur(UtilisateurDao dao, Scanner scanner) {
        // TODO: demander nom, age, email, créer un objet Utilisateur
        //       puis appeler dao.create(u)
    }

    private static void rechercherParId(UtilisateurDao dao, Scanner scanner) {
        // TODO: demander un id, puis appeler dao.findById(id) et afficher le résultat
    }

    private static void mettreAJourUtilisateur(UtilisateurDao dao, Scanner scanner) {
        // TODO: demander l'id de l'utilisateur à modifier, charger l'utilisateur,
        //       demander les nouvelles valeurs, puis appeler dao.update(u)
    }

    private static void supprimerUtilisateur(UtilisateurDao dao, Scanner scanner) {
        // TODO: demander l'id à supprimer, puis appeler dao.delete(id)
    }
}
