import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void Squad_instantiatesCorrectly_true() {
        Hero myHero = new Hero("Superman");
        assertEquals(true, myHero instanceof Hero);
    }

}
