public class Customer {
    protected String name;
    protected double money;

    public Customer(String name, double money){
        this.name = name;
        this.money = money;
    }
    public double getMoney(){
        return money;
    }
    public void useMoney(double amount){
        money -= amount;
    }
    public String getName(){
        return this.name;
    }
    public void addMoney(double amount){
        if(amount >= 0){
            money += amount;
        }else{
            System.out.println("CUSTOMER: You cannot add negative money!");
        }
    }
}
