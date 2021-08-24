package Aug23.daoTest;

import Aug23.dao.ConnectionFactory;
import Aug23.dao.DaoImplementation;
import Aug23.dao.Manager;
import Aug23.dao.User;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import javax.sql.DataSource;
import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static shopExample.Size.S;

@ExtendWith(MockitoExtension.class)
public class ManagerTest {
    @Mock
    private DataSource ds;

    @Mock
    private Connection c;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet rs;

    @Mock DaoImplementation d1;

    @InjectMocks
    Manager m1;

    private User p;
    /*
    @Before
    public void setUp() throws Exception {
        assertNotNull(c);
        when(c.prepareStatement(any(String.class))).thenReturn(stmt);
        //when(ds.getConnection()).thenReturn(c);

        p = new User(1L, "one", 1);

        when(rs.first()).thenReturn(true);
        when(rs.getLong(1)).thenReturn(p.getId());
        when(rs.getString(2)).thenReturn(p.getName());
        when(rs.getInt(3)).thenReturn(p.getAge());
        when(stmt.executeQuery()).thenReturn(rs);
    }

    @Test
    public void createUser() {
        m1.getImp1().addUser(p);
    }
*/



}
