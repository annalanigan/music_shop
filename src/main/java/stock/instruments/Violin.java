package stock.instruments;

public class Violin extends Instrument{

    public Violin(double inputBuy, double inputSell, InstrumentType inputType, String inputMake) {
        super(inputBuy, inputSell, inputType, inputMake);
    }

    public String play() {
        return "fiddlededee";
    }
}
