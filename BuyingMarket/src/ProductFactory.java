public class ProductFactory {
    protected String[] productNames = {
            "Bananas",
            "Strawberries",
            "Coconuts",
            "Batteries AA",
            "Batteries AAA",
            "Milk",
            "Your dad",
            "Lada",
            "Extra thick milk",
            "Shit",
            "Phone",
            "Movie"
    };
    public Product createProduct(){
        int id = (int)(Math.random()*999999999);
        String name = productNames[(int)(Math.random()*productNames.length)];
        double price = (double)(int)(Math.random()*20*100)/100;

        return new Product(id, name, price);
    }
}
