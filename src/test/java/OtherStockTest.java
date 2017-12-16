import org.junit.Before;
import org.junit.Test;
import stock.stockitems.Musicstand;
import stock.stockitems.Sheetmusic;
import stock.stockitems.Violinstring;

import static org.junit.Assert.assertEquals;

public class OtherStockTest {

    private Musicstand musicStand;
    private Sheetmusic sheetMusic;
    private Violinstring strings;

    @Before
    public void before(){
        musicStand = new Musicstand(20, 40);
        sheetMusic = new Sheetmusic(6, 18, "O Mio Babbino Caro", "Puccini");
        strings = new Violinstring(1, 3, "Pirastro");
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

    @Test
    public void getSheetMusicDescription(){
        assertEquals("O Mio Babbino Caro by Puccini", sheetMusic.getDescription());
    }

    @Test
    public void getMusicStandDescription(){
        assertEquals("Music stand", musicStand.getDescription());
    }

    @Test
    public void getViolinStringDescription(){
        assertEquals("Violin String", strings.getDescription());
    }

}
