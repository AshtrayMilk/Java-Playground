import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {

        /*
        Store store = new Store("Kallen kyläkauppa", "sdjfklsdf", "Kalle");
        store.createStore();
        store.supplyStore();
        store.listProductsInStock();
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Customer customer = new Customer("kalle", 23489.4);
        store.sellProduct(id,1 , customer);
        store.listProductsInStock();

        CustomerHandler customerHandler = new CustomerHandler();
        customerHandler.printCustomers();
         */

        MenuHandler menu = new MenuHandler();
        menu.start();

    }
}