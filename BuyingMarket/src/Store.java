import java.util.*;

public class Store {

    //store details
    protected String name;
    protected String location;
    protected String headOfTheStore;
    protected ProductFactory supplier = new ProductFactory();
    protected double grossProduct = 0;

    protected Map<Integer, Product> products = new HashMap<Integer, Product>();

    public Store(String name, String address, String headOfTheStore){
        this.name = name;
        this.location = address;
        this.headOfTheStore = headOfTheStore;
        createStore();
    }
    public String getName(){
        return name;
    }
    public void createStore(){
        int differentArticles = (int)(Math.random()*10);
        for(int i = 0; i < differentArticles; i++){
            Product product = supplier.createProduct();
            products.put(product.getId(), product);
        }
    }
    public void listProductsInStock(){
        System.out.println(":::STORE: "+name+":::");
        System.out.println(":::Listing all the products in stock:::");

        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Integer id = entry.getKey();
            Product product = entry.getValue();
            System.out.println("------------------------");
            System.out.println(product.getProductDetails());
            System.out.println("------------------------");
        }
    }
    public int[] getProductIds(){
        int[] IDs = new int[products.size()];
        int counter = 0;
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            int key = entry.getKey();
            IDs[counter] = key;
            counter++;
        }
        return IDs;
    }
    public void supplyStore(){
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Integer id = entry.getKey();
            Product product = entry.getValue();
            int amount = (int)(Math.random()*20);
            product.addToStock(amount);
        }
    }
    public double sellProduct(int id, int amount, Customer customer){
        Product product = products.get(id);
        if(product == null){
            System.out.println("STORE: Given item id was not found!");
            return -1;
        }
        double result = product.takeProductsFromStock(amount);
        if(result == -1){
            System.out.println("STORE: You cannot take negative amounts!");
            return -1;
        }else if(result == 0){
            String leftInStock = product.getProductDetails();
            System.out.println("STORE: You cannot take that many from stock");
            System.out.println("STORE: This much we have the given article");
            System.out.println(leftInStock);
            return -1;
        }else{
            if(customer.getMoney() >= product.getPrice()*amount){
                System.out.println("STORE: Customer "+customer.getName()+" purchased product "+product.getName()+
                        "\n with amount "+amount+"\n with price "+product.getPrice()*amount);
                grossProduct += product.getPrice()*amount;
                return product.getPrice()*amount;
            }
            else{
                System.out.println("STORE: Customer "+customer.getName()+" don't have enough money for purhase");
                product.addToStock(amount);
                return -1;
            }
        }
    }
}
