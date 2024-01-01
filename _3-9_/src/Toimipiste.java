import java.util.ArrayList;
import java.util.List;

public class Toimipiste {
    private int id;
    private Henkilo vastuuhenkilo;
    private Osoite osoite;
    private String puhelinNumero;

    private List<Myyntitapahtuma> myyntitapahtumat = new ArrayList<Myyntitapahtuma>();

    public Toimipiste(int id, Henkilo vastuuhenkilo, Osoite osoite, String puhelinNumero){
        this.id = id;
        this.vastuuhenkilo = vastuuhenkilo;
        this.osoite = osoite;
        this.puhelinNumero = puhelinNumero;
    }

    public void tulostaToimipisteenTiedot(){
        System.out.println("-------TOIMIPISTE-------");
        System.out.println("Toimipiste: "+id);
        System.out.println("Osoite: "+osoite.getTiedot());
        System.out.println("Vastuuhenkilö: "+vastuuhenkilo.getNimi());
        System.out.println("Puh: "+puhelinNumero);
        tulostaMyyntitapahtumat();
    }

    public void lisaaMyyntitapahtuma(Myyntitapahtuma myyntitapahtuma){
        myyntitapahtumat.add(myyntitapahtuma);
    }
    private void tulostaMyyntitapahtumat(){
        for (int i = 0; i < myyntitapahtumat.size(); i++) {

            // Print all elements of List
            myyntitapahtumat.get(i).printMyyntitapahtumanTiedot();
        }
    }
}
