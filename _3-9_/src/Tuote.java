public class Tuote {
    private int id;
    private String nimi;
    private double hinta;

    public Tuote(int id, String nimi, double hinta){
        this.id = id;
        this.nimi = nimi;
        this.hinta = hinta;
    }
    public String getNimi(){
        return nimi;
    }
}
