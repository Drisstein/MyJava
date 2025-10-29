package Bob;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, mdp;
        Scanner sc = new Scanner(System.in);
        System.out.print("username : ");
        username = sc.nextLine();
        System.out.print("password : ");
        mdp = sc.nextLine();
        Utilisateur.login(username,mdp); 

    }
}
