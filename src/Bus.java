public class Bus extends Koeretoej{         //sub class
    private int antalPassagerer;
    private int antalDoere;

    public Bus (double vaegtafgift, String registreringsNr, int antalPassagerer, int antalDoere) {
        super(vaegtafgift, registreringsNr);
        this.antalPassagerer = antalPassagerer;
        this.antalDoere = antalDoere;
    }
    public int getAntalPassagerer() {
        return antalPassagerer;
    }

    public void setAntalPassagerer(int antalPassagerer) {
        this.antalPassagerer = antalPassagerer;
    }

    public int getAntalDoere() {
        return antalDoere;
    }

    public void setAntalDoere(int antalDoere) {
        this.antalDoere = antalDoere;
    }

    public void udskriv() {
        super.udskriv();
        System.out.println();
    }
}
