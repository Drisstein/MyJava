import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurDaoJdbc implements UtilisateurDao {

    private final String url;
    private final String user;
    private final String pass;

    public UtilisateurDaoJdbc(String url, String user, String pass) {
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    @Override
    public long create(Utilisateur u) throws SQLException {
        // TODO: implémenter l'INSERT avec PreparedStatement et RETURN_GENERATED_KEYS
        //       puis mettre à jour u.setId(idGenere) et retourner l'id
        return 0L;
    }

    @Override
    public Utilisateur findById(long id) throws SQLException {
        // TODO: implémenter un SELECT ... WHERE id = ?
        return null;
    }

    @Override
    public List<Utilisateur> findAll() throws SQLException {
        // TODO: implémenter un SELECT * FROM utilisateurs
        return new ArrayList<>();
    }

    @Override
    public void update(Utilisateur u) throws SQLException {
        // TODO: implémenter un UPDATE utilisateurs SET nom = ?, age = ?, email = ? WHERE id = ?
    }

    @Override
    public void delete(long id) throws SQLException {
        // TODO: implémenter un DELETE FROM utilisateurs WHERE id = ?
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }
}
