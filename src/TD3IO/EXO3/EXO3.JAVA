// Exercice 3 : Copie de fichiers binaires
// 1.  ́Ecrire une application Java qui copie le contenu d’un fichier source binaire vers un fichier de destination. 
// 2. Utiliser les classes FileInputStream et FileOutputStream. 3. Ajouter un message indiquant le succ`es ou l’ ́echec de l’operation.
package TD3IO.EXO3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class EXO3 {
    public static void main(String[] args) {
        String sourceFile = "source.bin";
        String destFile = "destination.bin";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Le fichier a été copié avec succès.");

        } catch (IOException e) {
            System.err.println("Erreur lors de la copie du fichier : " + e.getMessage());
        }
    }
}