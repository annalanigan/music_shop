package instruments;

public class Flute extends Instrument{

    private FluteType key;

    public Flute(InstrumentType inputType, String inputMake, double inputPrice, FluteType inputKey) {
        super(inputType, inputMake, inputPrice);
        this.key = inputKey;
    }

    public String play() {
        return "Trill";
    }
}
