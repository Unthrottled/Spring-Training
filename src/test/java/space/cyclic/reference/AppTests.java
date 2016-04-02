package space.cyclic.reference;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertTrue;

public class AppTests {

    protected WebApplicationContext wac;

    @Before
    public void setup() {

    }

    @Test
    public void simple() throws Exception {
        assertTrue(true);
    }
}
