public class Utilisateur {

    private long id;
    private String nom;
    private int age;
    private String email;

    public Utilisateur() {
    }

    public Utilisateur(long id, String nom, int age, String email) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " - " + nom + " (" + age + ") <" + email + ">";
    }
}
