//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Toteuta ohjelma joka laskee paljonko maksaa kuukaudessa puhutut
        428.5 min ja 36 tekstiviestiä.
        Puhelun minuuttihinta on 0.069€
        Teksitivestin kappalehinta on 0.030€
        Pyöristä kahteen decimaaliin
        */
        double talkedMinutes = 428.5;
        int sentMessages = 36;

        double costPerMinutes = 0.069;
        double costPerMessage = 0.030;

        double total = talkedMinutes * costPerMinutes + sentMessages * costPerMessage;
        total = Math.round(total * 100.0)/100.0;
        System.out.println("Totalcost: "+total+"€");
    }
}