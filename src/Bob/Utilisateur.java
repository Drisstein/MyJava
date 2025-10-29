package Bob;
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

    public static boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }


        boolean hasLowerCase = true;
        boolean hasUpercase = true;
        boolean hasDigit = true;

        for (char c : password.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                hasUpercase = false;

            }
            if (!Character.isLowerCase(c)) {
                hasLowerCase = false;
            }
            if (!Character.isDigit(c)) {
                hasDigit = false;
            }

        }
        return (hasDigit && hasUpercase && hasLowerCase);
        
    }

    public static void login(String username, String mdp) {
        if (!checkPassword(mdp)) {
            System.out.println("Mot de passe invalide");
        } else {
            Utilisateur user1 = new Utilisateur(username, mdp);
            System.out.println("Bienvenue, " + user1.getUsername());
        }

    }

}
