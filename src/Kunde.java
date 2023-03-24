public abstract class Kunde implements Vorschrift {
    private int kdNr;
    private String name;

    public Kunde(int kdNr, String name) {
        this.kdNr = kdNr;
        this.name = name;
    }

    public int getKdNr() {
        return kdNr;
    }

    public void setKdNr(int kdNr) {
        this.kdNr = kdNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // abstrakte muss in den Unterklassen ausimplementiert werden!


}
