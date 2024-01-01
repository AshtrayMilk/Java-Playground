import java.util.HashMap;
import java.util.Map;

public class CustomerHandler {
    protected Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

    protected String[] customerFirstNames = {
            "Kille", "Kalle", "Jullevi", "Jooseppi", "Marjaliisa", "Kalevi", "Jalo", "Urho", "Jenni", "A.C.E"
    };
    protected String[] customerSurnames = {
            "Hiltunen", "Korhonen", "Lempäälä", "Kivikallio", "Kekkonen", "Kaira", "Kivessilta"
    };
    public CustomerHandler(){
        createCustomers();
    }
    private void createCustomers(){
        int customerAmount = (int)(Math.random()*7);
        for(int i = 0; i < customerAmount; i++){
            String customerName =
                    customerFirstNames[(int)(Math.random()*customerFirstNames.length)]
                    +" "
                    +customerSurnames[(int)(Math.random()*customerSurnames.length)];
            double customerMoney = (int)(Math.random()*200);
            Customer customer = new Customer(customerName, customerMoney);
            customers.put(i, customer);
        }
    }
    public void printCustomers(){
        int customerCount = customers.size();
        System.out.println("We have "+customerCount+" potential customers");
        for (Map.Entry<Integer, Customer> entry : customers.entrySet()) {
            int key = entry.getKey();
            Customer customer = entry.getValue();
            System.out.println(customer.getName()+" "+customer.getMoney());
        }
    }

    public void simulateBuyingProducts(Map<Integer, Store> stores) {
        for (Map.Entry<Integer, Store> storeEntry : stores.entrySet()) {
            int key = storeEntry.getKey();
            Store store = storeEntry.getValue();

            for (Map.Entry<Integer, Customer> customerEntry : customers.entrySet()) {
                Customer customer = customerEntry.getValue();
                boolean isBuyingProduct = Math.random() < 0.3;

                if(isBuyingProduct){
                    int[] productIDs = store.getProductIds();
                    int selectedId = productIDs[(int)(Math.random()*productIDs.length)];
                    int amount = (int)(Math.random()*4);
                    double cost = store.sellProduct(selectedId, amount, customer);
                    customer.useMoney(cost);
                }
            }
        }

    }
}
