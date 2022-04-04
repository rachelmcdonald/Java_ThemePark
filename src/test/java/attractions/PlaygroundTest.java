package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor1 = new Visitor(14, 120, 10);
        visitor2 = new Visitor(17, 180, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void canCheckIsAllowedTo() {
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void canCheckIsAllowedToUnderage() {
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
