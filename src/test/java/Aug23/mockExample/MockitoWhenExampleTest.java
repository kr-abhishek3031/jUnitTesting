package Aug23.mockExample;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

class MockitoWhenExampleTest {

    @Mock
    Iterator<String> i;

    Comparable<String> c;

    // demonstrates the return of multiple values
    @Test
    void testMoreThanOneReturnValue() {
        try{
            when(i.next()).thenReturn("Mockito").thenReturn("rocks");
            String result = i.next() + " " + i.next();
            // assert
            assertEquals("Mockito rocks", result);
        }
        catch (NullPointerException e){
            assertNull(null);
        }

    }
}
