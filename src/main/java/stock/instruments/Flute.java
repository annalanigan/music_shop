package stock.instruments;

public class Flute extends Instrument{

    private FluteType key;

    public Flute(double inputBuy, double inputSell, InstrumentType inputType,String inputMake, FluteType inputKey) {
        super(inputBuy, inputSell, inputType, inputMake);
        this.key = inputKey;
    }

    public FluteType getKey() {
        return key;
    }

    public void setKey(FluteType key) {
        this.key = key;
    }

    public String play() {
        return "Trill";
    }

}
