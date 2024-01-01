public class Henkilo {
    private String nimi;
    private Osoite osoite;
    private String puhelinNumero;


    public Henkilo(String nimi, Osoite osoite, String puhelinNumero){
        this.nimi = nimi;
        this.osoite = osoite;
        this.puhelinNumero = puhelinNumero;
    }
    public String getNimi(){
        return nimi;
    }
}
