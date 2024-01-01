//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Toteutettava on ohjelma, jolla tuotetaan koskiketjun myyntiraportteja.
        Ketjulla on toimipisteitä eri kaupungeissa. JOkaisests toimipisteestä on tiedossa vastaava henkilö,
        osoite, ja puhelinnumero. Kioskeista myydään useita eri tuotteita. JOkaisella tuotteella on
        identifioiva id-numero , nimi, ja hinta. Raportille halutaan tuottaa jokaisen toimipisteen
        myyntitiedot päivittäin.

        This is just a simple demonstratin how to use classes by the book, hence there are
        no actual data factories or control handles.
         */

        Tuote mansikka = new Tuote(1, "3kg mansikkarasia", 12.50);
        Tuote omena = new Tuote( 2, "2kg omenapussi", 3.50);
        Tuote rusina = new Tuote(3, "1kg rusinoita", 14.20);

        Osoite osoite1 = new Osoite("Kalmarikuja 4", "b20");
        Osoite osoite2 = new Osoite("Kalmarikuja 1", "c9");
        Osoite osoite3 = new Osoite("Kylmäkallentie 2", "b10");
        Osoite osoite4 = new Osoite("Hurjakuja 3" , "b20");
        Osoite osoite5 = new Osoite("Tuuleviirintie 2", "b19");

        Henkilo myyja1 = new Henkilo("Kalle", osoite1, "0348235895");
        Henkilo myyja2 = new Henkilo("Kullervo", osoite2, "3849023445");
        Henkilo myyja3 = new Henkilo("Kille", osoite2, "384928340829034");

        Toimipiste toimipiste1 = new Toimipiste(1, myyja1, osoite3, "32849084");
        Toimipiste toimipiste2 = new Toimipiste(2, myyja2, osoite4, "34892348905");
        Toimipiste toimipiste3 = new Toimipiste(3, myyja3, osoite5, "8e49230840834");

        Myyntitapahtuma tapahtuma1 = new Myyntitapahtuma(toimipiste1, "29-11-2000", mansikka, 3);
        Myyntitapahtuma tapahtuma2 = new Myyntitapahtuma(toimipiste1, "29-11-2000", mansikka, 3);
        Myyntitapahtuma tapahtuma3 = new Myyntitapahtuma(toimipiste1, "29-11-2000", mansikka, 3);
        Myyntitapahtuma tapahtuma4 = new Myyntitapahtuma(toimipiste1, "29-11-2000", mansikka, 3);

        toimipiste1.lisaaMyyntitapahtuma(tapahtuma1);
        toimipiste1.lisaaMyyntitapahtuma(tapahtuma2);
        toimipiste2.lisaaMyyntitapahtuma(tapahtuma3);
        toimipiste3.lisaaMyyntitapahtuma(tapahtuma4);


        toimipiste1.tulostaToimipisteenTiedot();
        toimipiste2.tulostaToimipisteenTiedot();
        toimipiste3.tulostaToimipisteenTiedot();



    }
}