package TD12025.Exo1;

// EXO1
// Créez une calculatrice simple en Java qui permet les opérations de base : addition, soustraction,
// multiplication et division.
// Gérez les exceptions suivantes :
// — Division par zéro (ArithmeticException).
// — Entrée invalide de l’utilisateur pour les nombres (NumberFormatException).
// — Opération inconnue (lève une exception personnalisée OperationInvalideException si l’utilisa-
// teur saisit une opération non reconnue).
// Pour chaque erreur, affichez un message expliquant l’erreur et demandez à l’utilisateur de saisir à nouveau
// les valeurs
// public class Calculatrice {
// }
import java.util.Scanner;

class OperationInvalideException extends Exception {
    /**
     * Creer une nouvelle instance de
     * NombreNonValideException
     */
    public OperationInvalideException(String message) {
        super(message);
    }
    /**
     * Crée une nouvelle instance de
     * NombreNonValideException
     */
}

public class Calculatrice {

    public static void main(String[] args) throws OperationInvalideException {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            while (true) {
               
                    System.out.print("Entrer a :");
                    a = sc.nextInt();
                    System.out.print("Choix de l'operateur (+,-,/,*):");
                    String op = sc.next().trim();
                    System.out.print("Entrer b:");
                    b = sc.nextInt();
            

                int result;
                switch (op) {
                    case "+":
                        result = a + b;
                        System.out.println(a + "+" + b + "=" + (a + b));
                        break;
                    case "-":
                        result = a - b;
                        System.out.println(a + "-" + b + "=" + (a - b));
                        break;
                    case "/":
                        result = a / b;
                        if (b == 0)
                            throw new ArithmeticException("Division par 0 impossible !");

                        System.out.println(a + "/" + b + "=" + (a / b));
                        break;
                    case "*":
                        result = a * b;
                        System.out.println(a + "*" + b + "=" + (a * b));
                        break;

                    default:
                        throw new OperationInvalideException((op) + " : Opérateur invalide ! ");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrée invalide ! Veuillez entrer des nombres valides.");
        } catch (ArithmeticException e) {
            System.out.println("Erreur" + e.getMessage());
        }
    }
}
