import java.sql.SQLException;
import java.util.List;

public interface UtilisateurDao {

    long create(Utilisateur u) throws SQLException;

    Utilisateur findById(long id) throws SQLException;

    List<Utilisateur> findAll() throws SQLException;

    void update(Utilisateur u) throws SQLException;

    void delete(long id) throws SQLException;
}
