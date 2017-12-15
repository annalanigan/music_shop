import org.junit.Before;
import org.junit.Test;
import stock.instruments.Violin;
import stock.stockitems.Musicstands;
import stock.stockitems.Sheetmusic;
import stock.stockitems.Violinstrings;

import static org.junit.Assert.assertEquals;

public class OtherStockTest {

    private Musicstands musicStand;
    private Sheetmusic sheetMusic;
    private Violinstrings strings;

    @Before
    public void before(){
        musicStand = new Musicstands(20, 40);
        sheetMusic = new Sheetmusic(6, 18, "O Mio Babbino Caro", "Puccini");
        strings = new Violinstrings(1, 3, "Pirastro");
    }

    @Test
    public void canGetStringsMarkup(){
        assertEquals(2, strings.calculateMarkup(),0.01);
    }

    @Test
    public void canGetString(){
        assertEquals("Pirastro", strings.getBrand());
    }

    @Test
    public void canGetComposer(){
        assertEquals("Puccini", sheetMusic.getComposer());
    }

}
