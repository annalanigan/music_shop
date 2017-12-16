package stock.instruments;

public enum PianoType {
    UPRIGHT("Upright"),
    BABYGRAND("Baby grand"),
    GRAND("Grand"),
    ELECTRIC("Electric"),
    HARPSICHORD("Harpsichord");

    private final String name;

    PianoType (String name){
        this.name = name;
    }

    public String getPretty() {
        return name;
    }
}
