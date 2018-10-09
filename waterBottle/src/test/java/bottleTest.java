
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class bottleTest {

    Bottle bottle;

    @Before
    public void before() {
        bottle = new Bottle();
    }

    @Test
    public void volume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void reduceVolumeBy10() {
        assertEquals(90, bottle.reduceVolume());
    }

    @Test
    public void emptyBottle() {
        assertEquals(0, bottle.emptyVolume());
    }

    @Test
    public void fillVolume() {
        assertEquals(100, bottle.fillVolume());
    }
}