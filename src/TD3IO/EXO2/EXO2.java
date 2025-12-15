// Exercice 2 :  ́Ecriture dans un fichier texte
// 1. Cr ́eer une application Java qui demande `a l’utilisateur d’entrer une liste de
// phrases via la console. 
// 2. Enregistrer ces phrases dans un fichier texte nomm ́e phrases.txt en utilisant un BufferedWriter. 
// 3. Ajouter une fonctionnalit ́e pour v ́erifier si le fichier a bien  ́ete cree.
package TD3IO.EXO2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class EXO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez des phrases (tapez 'exit' pour terminer) :");
        // String chemin="D:\\Semestre5\\JAVA\\src\\TD3IO\\EXO2";
        String chemin="src\\TD3IO\\EXO2";
        File file = new File("phrases.txt");
        boolean fileCreated = false;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(chemin+file))) {
            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(line);
                writer.newLine();
            }
            fileCreated = true;
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }

        if (fileCreated && file.exists()) {
            System.out.println("Le fichier 'phrases.txt' a été créé avec succès.");
        } else {
            System.out.println("Le fichier n'a pas pu être créé.");
        }
    }
}

