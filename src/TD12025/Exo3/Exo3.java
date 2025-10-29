package TD12025.Exo3;

// Exercice 3 : Validateur de Mot de Passe avec Critères

// Créez une classe PasswordValidator qui vérifie la sécurité d’un mot de passe entré par l’utilisateur.
// Le mot de passe doit respecter les critères suivants :
// — Longueur minimale de 8 caractères.
// — Contenir au moins un chiffre.
// — Contenir au moins une lettre majuscule et une lettre minuscule.
// Créez des exceptions personnalisées (MotDePasseTropCourtException, MotDePasseSansChiffreException, (etc.) pour chaque critère non respecté, et affichez un message explicatif pour chaque erreur

public class Exo3 {
    public static void main(String[] args) {
        String password = ""; // Exemple de mot de passe à valider
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            PasswordValidation PasswordCheck = new PasswordValidation(password);
            try {
                System.out.print("Entrer le mot de passe à valider : ");
                password = sc.nextLine();
                PasswordCheck.validation(password);
                System.out.println("Mot de passe valide.");
                break;
            } catch (MotDePasseTropCourtException | MotDePasseSansChiffreException | MotDePasseSansMajusculeException
                    | MotDePasseSansMinusculeException e) {
                System.out.println("Erreur de validation du mot de passe : " + e.getMessage());
            }

        }

    }

}
