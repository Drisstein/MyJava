// Exercice 1 : Lecture de fichiers texte
// 1.  ́Ecrire une application Java qui demande `a l’utilisateur le chemin d’un
// fichier texte. 
// 2. Lire et afficher son contenu ligne par ligne en utilisant un
// BufferedReader. 
// 3. Compter le nombre de lignes et de mots dans le fichier,
// puis afficher les r ́esultats.
package TD3IO.EXO1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le chemin du fichier texte : ");
        String filePath = scanner.nextLine();

        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
        System.out.println("Nombre de lignes : " + lineCount);
        System.out.println("Nombre de mots : " + wordCount);

    }
}

//NOTES DE LEXO
// Je vais
// expliquer précisément
// ce que
// fait line.trim().split("\\s+");
// dans Exo1.java.

// line.trim():
// supprime les

// espaces (et tabulations, retours chariot en début et fin) de la chaîne line. Ex. "  bonjour " → "bonjour".
// "\\s+" (motif regex) : \s signifie « tout caractère d’espacement » (espace, tabulation, saut de ligne, etc.). Le + signifie « une ou plusieurs occurrences ». Dans un littéral Java on écrit \\s+ parce qu’il faut échapper la barre oblique inverse dans la chaîne.
// split("\\s+") : découpe la

// chaîne (ici le résultat de trim()) en un tableau de sous-chaînes en séparant par n’importe quelle suite d’espaces. Ex. "a  b\tc".split("\\s+") → ["a","b","c"].
// Effet combiné : line.trim().split("\\s+"); retourne un tableau de « mots » de la ligne en ignorant les espaces en début/fin et en considérant comme séparateurs n’importe quelle suite d’espaces internes.
// Comportement important à

// connaître (cas limite) :
// Si line.trim() est la chaîne vide "" (par exemple la ligne contient seulement des espaces),alors split("\\s+") renverra un tableau d’une seule chaîne vide (new String[]{""})—
// ce qui peut fausser un comptage de mots (compte 1 au lieu de 0).
// Remède simple : vérifier trimmed.isEmpty() avant de splitter.