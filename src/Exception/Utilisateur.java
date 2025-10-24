package Exception;

import java.util.Scanner;

public class Utilisateur {
    private String username;
    private String password;

    public Utilisateur(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.username;
    }

    public void setPassword(String mdp) {
        this.username = mdp;
    }

    public static void checkPassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Trop court ");
        }

        for (char c : password.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                throw new HasUppercaseException("Doit contenir au moins une Majuscule ! ");

            }
            if (!Character.isDigit(c)) {
                throw new HasLowerException("Doit contenir au moins un chiffre ! ");
            }
            if (!Character.isLowerCase(c)) {
                throw new HasLowerException("Doit contenir au moins une Miniscule ! ");
            }

        }

    }

    public static void login(String username, String mdp) {
        try {
            checkPassword(mdp);
            Utilisateur user1 = new Utilisateur(username, mdp);
            System.out.println("Bienvenue, " + user1.getUsername());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
