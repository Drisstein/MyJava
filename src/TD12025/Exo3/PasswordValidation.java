package TD12025.Exo3;

// Le mot de passe doit respecter les critères suivants :
// — Longueur minimale de 8 caractères.
// — Contenir au moins un chiffre.
// — Contenir au moins une lettre majuscule et une lettre minuscule.
// Créez des exceptions personnalisées (MotDePasseTropCourtException, MotDePasseSansChiffreException, (etc.) pour chaque critère non respecté, et affichez un message explicatif pour chaque erreur

class MotDePasseTropCourtException extends Exception {
    public MotDePasseTropCourtException(String message) {
        super(message);
    }
}

class MotDePasseSansChiffreException extends Exception {
    public MotDePasseSansChiffreException(String message) {
        super(message);
    }
}

class MotDePasseSansMajusculeException extends Exception {
    public MotDePasseSansMajusculeException(String message) {
        super(message);
    }
}

class MotDePasseSansMinusculeException extends Exception {
    public MotDePasseSansMinusculeException(String message) {
        super(message);
    }
}

public class PasswordValidation {
    String password ; 

    public PasswordValidation(String password) {
        this.password = password;
    }
    
    public void validation() throws MotDePasseTropCourtException, MotDePasseSansChiffreException,
            MotDePasseSansMajusculeException, MotDePasseSansMinusculeException {
        if (password.length() < 8) {
            throw new MotDePasseTropCourtException("Le mot de passe doit contenir au moins 8 caractères.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new MotDePasseSansChiffreException("Le mot de passe doit contenir au moins un chiffre.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new MotDePasseSansMajusculeException("Le mot de passe doit contenir au moins une lettre majuscule.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new MotDePasseSansMinusculeException("Le mot de passe doit contenir au moins une lettre minuscule.");
        }
    }
}
