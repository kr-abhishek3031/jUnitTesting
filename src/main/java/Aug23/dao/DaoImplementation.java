package Aug23.dao;

import org.junit.Assert;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImplementation  implements UserDao {
    private DataSource ds;
    public DaoImplementation(DataSource ds){
        this.ds =ds;
    }
    @Override
    public List<User> getUsers(Long id) {
        try {
            Connection cn   = ds.getConnection();
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            List<User> users = new ArrayList<>();

            while(rs.next()) {
                User user =populateUserFromResults(rs);

                users.add(user);
            }

            return users;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public int addUser(User user) {
        try {
            Connection cn   = ds.getConnection();
            PreparedStatement ps = cn.prepareStatement("INSERT INTO users VALUES (?, ?, ?)");
            ps.setLong(1, user.getId());
            ps.setString(2, user.getName());
            ps.setInt(3, user.getAge());
            int i = ps.executeUpdate();

            if(i == 1) {
                return i;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return 0;
    }

    @Override
    public void updateUser(User user) {
        try {
            Connection cn   = ds.getConnection();
            PreparedStatement ps = cn.prepareStatement("UPDATE users SET name=?, age=? WHERE id=?");
            ps.setString(1, user.getName());
            ps.setInt(2, user.getAge());
            ps.setLong(3, user.getId());
            int i = ps.executeUpdate();
        } catch (SQLException ex ) {
            ex.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteUser(Long id) {
        try {
            Connection cn   = ds.getConnection();
            Statement stmt = cn.createStatement();
            int i = stmt.executeUpdate("DELETE FROM users WHERE id=" + id);


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private User populateUserFromResults(ResultSet rs) throws SQLException{
        User user = new User();
        user.setId( rs.getLong("id") );
        user.setName( rs.getString("name") );
        user.setAge(rs.getInt("age"));
        return user;
    }
}
