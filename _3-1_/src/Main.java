//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Toteuta kohdeluokka puhelu jolla double tyyppinen atribuutti kesto
        Toteuta luokalle parametrillien konstruktori sekä set- ja get-metodit.
        Set-metodissa tulee tarkistaa että puhelun kestoń arvo on suurempi kuin nolla
        Toteuta luokkaan myös metodi laskeHinta, joka laskee ja palauttaa puhelun hinnan.
        */
        
        PhoneCall phonecall1 = new PhoneCall(20.4);
        PhoneCall phonecall2 = new PhoneCall(4.3);
        double totalCost = phonecall1.calculateCost() + phonecall2.calculateCost();
        System.out.println("Totalcost: "+totalCost);
    }
}