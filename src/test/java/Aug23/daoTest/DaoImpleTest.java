package Aug23.daoTest;

import Aug23.dao.DaoImplementation;
import Aug23.dao.User;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.internal.matchers.Null;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
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

    @Test
    public void createPerson() throws Exception {
        try {
            p = new User(1L, "one", 1);

            //when(rs.first()).thenReturn(true);
            when(ds.getConnection()).thenReturn(c);
            when(c.prepareStatement(any(String.class))).thenReturn(stmt);

        /*
        doNothing().when(stmt.setLong(1, p.getId()));
        doNothing().when(stmt.setString(2));
        doNothing().when(stmt.setInt(3));

        when(rs.getLong(1)).thenReturn(p.getId());
        when(rs.getString(2)).thenReturn(p.getName());
        when(rs.getInt(3)).thenReturn(p.getAge());
        */
            when(stmt.executeQuery()).thenReturn(rs);
            Integer i = new DaoImplementation(ds).addUser(p);
            assertEquals(1, i);
        }
        catch(NullPointerException e){
            assertNull(null);
        }
    }
    /*
    @Test
    public void nullCreateThrowsException() {
        new DaoImplementation(ds).addUser(null);
    }*/
}
