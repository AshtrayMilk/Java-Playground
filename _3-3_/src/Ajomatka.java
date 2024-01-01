public class Ajomatka {
    private double pituus;
    private String paivamaara;
    private double kilometriKorvaus = 0.44;

    public Ajomatka(double pituus, String paivamaara){
        this.pituus = pituus;
        this.paivamaara = paivamaara;
    }

    public void tulostaTiedot() {
        double kilometrikorvaus = kilometriKorvaus * pituus;
        System.out.println("----------AJO-----------");
        System.out.println("Päivämäärä: "+paivamaara);
        System.out.println("Matka: "+pituus+"KM");
        System.out.println("Kilometrikorvaus: "+kilometrikorvaus+"€");
        System.out.println("------------------------");

    }
    public void setPituus(double pituus) {
        if(pituus > 0){
            this.pituus = pituus;

        }
        else {
            System.out.println("Väärä pituus");
        }
    }
}
