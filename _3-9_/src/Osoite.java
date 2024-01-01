public class Osoite {
    private String osoite;
    private String rappu;

    public Osoite(String osoite, String rappu){
        this.osoite = osoite;
        this.rappu = rappu;
    }
    public String getTiedot(){
        return osoite+" "+rappu;
    }
}
