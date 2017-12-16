package stock.instruments;

import stock.AllStock;

public abstract class Instrument extends AllStock implements IPlay{

    private InstrumentType type;
    private String make;

    public Instrument(double inputBuy, double inputSell, String description, InstrumentType inputType,String inputMake){
        super(inputBuy,inputSell, description);
        this.type = inputType;
        this.make = inputMake;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

}
