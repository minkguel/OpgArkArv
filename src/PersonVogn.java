public class PersonVogn extends Koeretoej{      //sub class
    private double hastighed;
    private int motorStr;
    private int hesteKraefter;

    public PersonVogn() {
    }

    public PersonVogn(double hastighed, int motorStr, int hesteKraefter){

    }

    public double getHastighed() {
        return hastighed;
    }

    public void setHastighed(double hastighed) {
        this.hastighed = hastighed;
    }

    public int getMotorStr() {
        return motorStr;
    }

    public void setMotorStr(int motorStr) {
        this.motorStr = motorStr;
    }

    public int getHesteKraefter() {
        return hesteKraefter;
    }

    public void setHesteKraefter(int hesteKraefter) {
        this.hesteKraefter = hesteKraefter;
    }

    public void udskrivPersonVogn() {
        System.out.println();
    }
}
