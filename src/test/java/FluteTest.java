import stock.instruments.Flute;
import stock.instruments.FluteType;
import stock.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    private Flute flute;

    @Before
    public void before(){
        flute = new Flute(100, 150, "Yamaha", FluteType.CFLUTE);
    }

    @Test
    public void canPlayFlute(){
        assertEquals("Trill", flute.play());
    }



}
