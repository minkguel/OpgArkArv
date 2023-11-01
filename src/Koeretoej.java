public class Koeretoej {    //super class
    protected double vaegtafgift;
    protected String registreringsNr;

    Koeretoej() {
    }
    public Koeretoej(double vaegtafgift, String registreringsNr) {
        this.vaegtafgift = vaegtafgift;
        this.registreringsNr = registreringsNr;
    }

    public double getVaegtafgift() {
        return vaegtafgift;
    }

    public void setVaegtafgift(double vaegtafgift) {
        this.vaegtafgift = vaegtafgift;
    }

    public String getRegistreringsNr() {
        return registreringsNr;
    }

    public void setRegistreringsNr(String registreringsNr) {
        this.registreringsNr = registreringsNr;
    }

    public void udskriv() {
        System.out.println("vaegtafgift: " + this.vaegtafgift);
        System.out.println("RegistreringsNummer: " + this.registreringsNr);
    }

}
