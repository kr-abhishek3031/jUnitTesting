package Aug23.daoTest;

import Aug23.dao.DaoImplementation;
import Aug23.dao.User;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class DaoImpleTest {
    @Mock
    private DataSource ds;

    @Mock
    private Connection c;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet rs;

    private User p;

    @Before
    public void setUp() throws Exception {
        assertNotNull(ds);
        when(c.prepareStatement(any(String.class))).thenReturn(stmt);
        when(ds.getConnection()).thenReturn(c);

        p = new User(1L, "one", 1);

        when(rs.first()).thenReturn(true);
        when(rs.getLong(1)).thenReturn(p.getId());
        when(rs.getString(2)).thenReturn(p.getName());
        when(rs.getInt(3)).thenReturn(p.getAge());
        when(stmt.executeQuery()).thenReturn(rs);

    }
    @Test
    public void createPerson() {
        Integer i = new DaoImplementation(ds).addUser(p);
        assertEquals(1, i);
    }
    /*
    @Test
    public void nullCreateThrowsException() {
        new DaoImplementation(ds).addUser(null);
    }*/
}
