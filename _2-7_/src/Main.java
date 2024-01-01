//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Määrittele viisi desimaalikukua
        // Laske keskiarvo sekä keskihajonta luvuille
        // Tulosta tulokset kahden desimaalin tarkkuudella

        //define values
        double d1 = 3.234;
        double d2 = 6.3425;
        double d3 = 8.345;
        double d4 = 89.234;
        double d5 = 1.234;
        double[] array = {d1, d2, d3, d4, d5};

        //calculate total sum of the numerical values
        double total = 0.0;
        for (double i : array) {
            total += i;
        }

        //calculate average
        double avg = total / 5;

        //calculate standard deviation
        double mean = total / 5;
        double standardDeviation = 0.0;
        for (double num : array) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation / 5);

        //rounding to 2 decimals
        avg = Math.round(avg * 100.0)/100.0;
        standardDeviation= Math.round(standardDeviation * 100.0)/100.0;
        //outputting the results
        System.out.println("Average: "+avg);
        System.out.println("Standard Deviation: "+standardDeviation);
    }
}