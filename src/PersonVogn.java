public class PersonVogn extends Koeretoej{      //sub class
    private double hastighed;
    private double motorStr;
    private int hesteKraefter;

    public PersonVogn(double vaegtafgift, String registreringsNr, double hastighed, double motorStr, int hesteKraefter){
        super(vaegtafgift, registreringsNr);
        this.hastighed = hastighed;
        this.motorStr = motorStr;
        this.hesteKraefter = hesteKraefter;

    }

    public double getHastighed() {
        return hastighed;
    }

    public void setHastighed(double hastighed) {
        this.hastighed = hastighed;
    }

    public double getMotorStr() {
        return motorStr;
    }

    public void setMotorStr(double motorStr) {
       this.motorStr = motorStr;
    }

    public int getHesteKraefter() {
        return hesteKraefter;
    }

    public void setHesteKraefter(int hesteKraefter) {
        this.hesteKraefter = hesteKraefter;
    }


    public void udskriv() {
        super.udskriv();
        System.out.println("Hastighed: " + this.hastighed);
        System.out.println("motorStr: " + this.motorStr);
        System.out.println("hestekraefter: " + this.hesteKraefter);
    }


}
