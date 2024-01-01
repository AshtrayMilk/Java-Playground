//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // toteuta ohjelma joka laskee paljonko saadaan kilometrikorvausta
        // 275 kilometriltä, kun yhtestä kilometristä saatava korvaus on 0.44€
        double kilometers = 275;
        double kilometerAllowancePerKilometer = 0.44;
        double totalKilometerAllowance = kilometers * kilometerAllowancePerKilometer;
        System.out.println("Kilometrikorvaus: "+totalKilometerAllowance);
    }
}