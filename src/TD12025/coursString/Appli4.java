package TD12025.coursString;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Appli4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            String Token;
            String op = "+-* ";
            int nbTokens = 0;
            System.out.print("Entrer une chaîne de caractères: ");
            str = sc.nextLine();

            StringTokenizer st = new StringTokenizer(str, op);
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
                Token = st.nextToken();
                nbTokens++;
            }
            System.out.println("Nombre de tokens: " + nbTokens);
        }
    }
}
