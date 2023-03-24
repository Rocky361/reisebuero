public class Premiumkunde extends Kunde {
    private int anzahlReisen;
    private String status;

    public Premiumkunde(int kdNr, String name, int anzahlReisen, String status) {
        super(kdNr, name);
        this.anzahlReisen = anzahlReisen;
        this.status = status;
    }

    public int getAnzahlReisen() {
        return anzahlReisen;
    }

    public void setAnzahlReisen(int anzahlReisen) {
        this.anzahlReisen = anzahlReisen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double reisePreisBerechnung(double basisPreis) {
        if(status.equals("Gold")){
            return basisPreis*0.8;
        }
        else if(status.equals("Silber")){
            return basisPreis*0.9;
        }
        else {
            return basisPreis*0.95;
        }
    }


}
