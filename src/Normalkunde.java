public class Normalkunde extends Kunde{
    private String vorname;

    public Normalkunde(int kdNr, String name, String vorname) {
        super(kdNr, name);
        this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public double reisePreisBerechnung(double basisPreis) {
        return basisPreis;
    }
}
