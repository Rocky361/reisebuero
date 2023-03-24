public class Main {
    public static void main(String[] args) {
        Premiumkunde pk = new Premiumkunde(455, "meier", 5, "arm");
        System.out.println(pk.getKdNr());
        System.out.println(pk.getName());
        System.out.println(pk.getAnzahlReisen());
        System.out.println(pk.getStatus());
        System.out.println(pk.reisePreisBerechnung(1000));

        Normalkunde nk = new Normalkunde(123, "poguntke", "martin");
        System.out.println(nk.getKdNr());
        System.out.println(nk.getName());
        System.out.println(nk.getVorname());
        System.out.println(nk.reisePreisBerechnung(1000));


    }
}