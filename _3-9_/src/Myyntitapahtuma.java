public class Myyntitapahtuma {
    private Toimipiste toimipiste;
    private String paivamaara;
    private Tuote tuote;
    private int kappalemaara;

    public Myyntitapahtuma(Toimipiste toimipiste, String paivamaara, Tuote tuote, int kappalemaara){
        this.toimipiste = toimipiste;
        this.paivamaara = paivamaara;
        this.tuote = tuote;
        this.kappalemaara = kappalemaara;
    }
    public void printMyyntitapahtumanTiedot(){
        System.out.println("_");
        System.out.println("Tuote: "+tuote.getNimi());
        System.out.println("paivamaara"+paivamaara);
        System.out.println("_");
    }

}
