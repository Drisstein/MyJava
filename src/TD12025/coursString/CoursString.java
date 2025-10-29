package TD12025.coursString;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CoursString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String delim = ",;. ";
        int nbTokens=0;
        System.out.print("Entrer une date format (jour 4 Novembre 2024): ");
        str1 = sc.nextLine();
        System.out.print("Votre date: " + str1);

        StringTokenizer tokenizer = new StringTokenizer(str1,delim);
        System.out.println("\nLes tokens sont:");
        // Iterate through tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
            nbTokens++;
        }
         
        System.out.println("Nombre de tokens: " + nbTokens);
    }
    }
