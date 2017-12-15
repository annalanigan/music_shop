import org.junit.Before;
import org.junit.Test;
import stock.instruments.InstrumentType;
import stock.instruments.Violin;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    private Violin violin1;

    @Before
    public void before(){
        violin1 = new Violin(200, 300, "Stradavarius");
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, violin1.calculateMarkup(), 0.01);
    }


}
