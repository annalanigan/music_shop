package stock.instruments;

public class Piano extends Instrument{

    private PianoType style;

    public Piano(double inputBuy, double inputSell, String inputMake, PianoType inputStyle) {
        super(inputBuy, inputSell, InstrumentType.KEYBOARD, inputMake);
        this.style = inputStyle;
    }

    public String play() {
        return "plinky plonk";
    }
}
