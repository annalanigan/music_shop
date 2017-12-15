import instruments.Flute;
import instruments.FluteType;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    private Flute flute;

    @Before
    public void before(){
        flute = new Flute(InstrumentType.WOODWIND, "Yamaha",100, FluteType.CFLUTE);
    }

    @Test
    public void canPLayFlute(){
        assertEquals("Trill", flute.play());
    }



}
