public class LastBil extends Koeretoej{     //sub class
    private int hesteKraefter;
    private double lastKapacitet;


    public LastBil() {
    }

    public LastBil(double vaegtafgift, String registreringsNr, int hesteKraefter, double lastKapacitet) {
        super(vaegtafgift, registreringsNr);
        this.hesteKraefter = hesteKraefter;
        this.lastKapacitet = lastKapacitet;
    }

    public int getHesteKraefter() {
        return hesteKraefter;
    }

    public void setHesteKraefter(int hesteKraefter) {
        this.hesteKraefter = hesteKraefter;
    }

    public double getLastKapacitet() {
        return lastKapacitet;
    }

    public void setLastKapacitet(double lastKapacitet) {
        this.lastKapacitet = lastKapacitet;
    }

    public void udskriv() {
        super.udskriv();
        System.out.println("Hestekraefter: " + this.hesteKraefter);
        System.out.println("LastKapacitet:" + this.lastKapacitet);
    }


}
