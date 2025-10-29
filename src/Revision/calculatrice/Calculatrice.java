package Revision.calculatrice;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            System.out.print("Entrer a :");
            a = sc.nextInt();
            System.out.println("Choix de l'operateur (+,-,%,*):");
            String op = sc.next().trim();
            System.out.print("Entrer b:");
            b = sc.nextInt();

            int result;
            switch (op) {
                case "+":
                    result = a + b;
                    System.out.println(a + "+" + "b" + "=" + (a + b));
                    break;
                case "-":
                    result = a - b;
                    System.out.println(a + "-" + b + "=" + (a - b));
                    break;
                case "/":
                    result = a / b;
                    System.out.println(a + "/" + b + "=" + (a / b));
                    break;
                case "*":
                    result = a * b;
                    System.out.println(a + "*" + b + "=" + (a * b));
                    break;
                case "":
                    System.out.println("Pas despace svp !");
                    break;

                default:
                    System.out.println("Opérateur invalide ! ");
                    break;
            }
        }
    }

}
