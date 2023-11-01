import java.util.ArrayList;

public class Main {

    public static void main(String [] args) {
        ArrayList<Koeretoej>koretojer = new ArrayList<>();

        PersonVogn personVogn1 = new PersonVogn(120.0, "2230db", 180, 2.0, 90);
        LastBil lastbil1 = new LastBil(500, "4530db", 50000,2);
        Bus bus1 = new Bus(5,"22db222",5,2);

        koretojer.add(personVogn1);
        koretojer.add(lastbil1);
        koretojer.add(bus1);

        for(Koeretoej koeretoej : koretojer ) {
            koeretoej.udskriv();
        }
    }

    public static void udskrivData(ArrayList<Koeretoej> koretojer) {
        for (int i=0; i< koretojer.size(); i++) {
            System.out.println(koretojer.get(i).getRegistreringsNr());
            System.out.println(koretojer.get(i).getVaegtafgift());
            if (koretojer.get(i) instanceof LastBil) {
                System.out.println(((LastBil) koretojer.get(i)).getHesteKraefter());
                System.out.println(((LastBil) koretojer.get(i)).getLastKapacitet());
            }
            if (koretojer.get(i) instanceof PersonVogn)
            {
                System.out.println(((PersonVogn) koretojer.get(i)).getHastighed());
                System.out.println(((PersonVogn) koretojer.get(i)).getMotorStr());
                System.out.println(((PersonVogn) koretojer.get(i)).getHesteKraefter());
            }
            if (koretojer.get(i) instanceof Bus){
                System.out.println(((Bus) koretojer.get(i)).getAntalDoere());
                System.out.println(((Bus) koretojer.get(i)).getAntalPassagerer());
            }


        }
    }
}





