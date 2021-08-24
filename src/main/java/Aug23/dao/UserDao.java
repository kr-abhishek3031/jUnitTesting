package Aug23.dao;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public interface UserDao {

    //Optional<User> getUser(Long id, Connection cn);

    //Optional<User> getUserByName(String name, Connection cn);

    List<User> getUsers(Long id);

    int addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
