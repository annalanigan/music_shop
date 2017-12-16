import org.junit.Before;
import org.junit.Test;
import stock.instruments.InstrumentType;
import stock.instruments.Piano;
import stock.instruments.PianoType;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano1;

    @Before
    public void before(){
        piano1 = new Piano(15000, 28000, "Steinway", PianoType.GRAND);
    }

    @Test
    public void canPlay(){
        assertEquals("plinky plonk", piano1.play());
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(28000, piano1.getSellPrice(),0.01);
    }

    @Test
    public void getDescription(){
        assertEquals("Steinway Grand Piano", piano1.getDescription());
    }


}
