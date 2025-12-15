// Exercice 4 : Recherche dans un fichier
// 1.  ́Ecrire une application Java qui recherche un mot donn ́e dans un fichier texte. 
// 2. Si le mot est trouv ́e, afficher la ou les lignes o`u il apparaˆıt ainsi que leur num ́ero. 3. G ́erer les exceptions si le fichier est introuvable ou illisible.
package TD3IO.EXO4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class EXO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le chemin du fichier texte : ");
        String filePath = scanner.nextLine();
        System.out.print("Entrez le mot à rechercher : ");
        String searchWord = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchWord)) {
                    System.out.println("Mot trouvé à la ligne " + lineNumber + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Le mot '" + searchWord + "' n'a pas été trouvé dans le fichier.");
            }

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}