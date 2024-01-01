import java.util.Calendar;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 2.1
        // Määrittele seuraavat tietotyypit seuraaville työntekijän tiedoille
        // Nimi
        // Palkka
        // Ikä
        // Syntymäaika
        // Osoite
        // Tieto siitä onko työntekijä lomalla

        String name = "Marjaliisa Korhonen";
        double salary = 3000;
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 1980);
        dateOfBirth.set(Calendar.MONTH, 5);
        dateOfBirth.set(Calendar.DATE, 2);
        Calendar now = Calendar.getInstance();
        int age = now.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        String address = "Kollikuja 20";
        boolean isOnVacation = false;

        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Date of birth: "+dateOfBirth.getTime());
        System.out.println("Age: "+age);
        System.out.println("Home Address: "+address);
        System.out.println("Is user on vacation: "+isOnVacation);

        //ok current age calculation is shit, but it suffices for now.
    }
}