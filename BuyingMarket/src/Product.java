public class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int inStock = 0;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double takeProductsFromStock(int amount){
        //if method parameters invalid, give error code -1
        if(amount <= 0){
            return -1;
        }
        //if transaction could not be completed, give error code 0
        else if(amount > inStock){
            return 0;
        }else{
            inStock -= amount;
            return amount * price;
        }
    }

    public boolean addToStock(int amount){
        if(amount <= 0){
            return false;
        }else{
            inStock += amount;
            return true;
        }
    }
    public String getProductDetails(){
        String details = "";
        details += "PRODUCT\n";
        details += "Id: "+id+"\n";
        details += "Name: "+name+"\n";
        details += "Price: "+price+"\n";
        details += "In Stock: "+inStock+"\n";

        return details;
    }
    public String getName(){
        return this.name;
    }
    public Double getPrice(){
        return price;
    }
    public int getId(){
        return id;
    }
    public boolean setPrice(double newPrice){
        if(newPrice <= 0){
            return false;
        }else{
            this.price = newPrice;
            return true;
        }
    }
}
