//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Toteuta ohjelma, joka toimii seuraavasti

        // Määrittele muutujat työntekijän nimeä ja palkkaa varten
        // sijoita palkaksi 3000 eur
        // sijoita nimi muuttujan nimesi
        // tulosta nimi ja palkka
        // toteuta 15% palkankorotus
        // tulosta ilmoitus palkankorotuksetsa, nimi , ja uusi palkka

        String name = "Kullervo Mac Nullervo";
        double salary = 3000;
        System.out.println("Nimi: "+name);
        System.out.println("Palkka: "+salary);
        System.out.println("-------------------");
        System.out.println("PALKANKOROTUS");
        double salaryIncrease =salary * 0.15;
        salary = salary + salaryIncrease;
        System.out.println("-------------------");
        System.out.println("Nimi: "+name);
        System.out.println("Palkka: "+salary);
        System.out.println("Palkankorotus: "+salaryIncrease);
    }
}