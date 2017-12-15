package stock.instruments;

public class Violin extends Instrument{

    public Violin(double inputBuy, double inputSell, String inputMake) {
        super(inputBuy, inputSell, InstrumentType.STRING, inputMake);
    }

    public String play() {
        return "fiddlededee";
    }
}
