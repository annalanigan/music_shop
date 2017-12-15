package instruments;

public abstract class Instrument {

    private InstrumentType type;
    private String make;
    private double buyPrice;

    public Instrument(InstrumentType inputType,String inputMake, double inputPrice){
        this.type = inputType;
        this.make = inputMake;
        this.buyPrice = inputPrice;
    }



}
