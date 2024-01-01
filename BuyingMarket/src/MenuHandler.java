import java.util.Scanner;

public class MenuHandler {
    Scanner scanner = new Scanner(System.in);
    Customer admin = null;
    public void start(){
        about();
        int option = -1;
        while(option != 0){
            startMenu();
            option = choice();
            switch(option){
                case 1:
                    if(admin != null){
                        simulate();
                    }else{
                        System.out.println("You need to define admin first!");
                    }
                    break;
                case 2:
                    if(admin != null){
                        System.out.println("You have already defined admin");
                        System.out.println("Would you like redefine it?");
                        System.out.println("0 no");
                        System.out.println("1 yes");
                        int option1 = choice();
                        if(option1 == 1) {
                            admin = defineAdmin();
                        }
                    }else {
                        admin = defineAdmin();
                    }
                    break;
                case 3:
                    about();
                    break;
            }
        }
    }
    private Customer defineAdmin(){
        String name;
        double money = 0;

        scanner.nextLine();
        System.out.println("Give admin name: ");
        name = scanner.nextLine();
        System.out.println("Give admin money, lol: ");
        while(money <= 0){
            try{
                money = scanner.nextDouble();
            }catch(Exception e){
                System.out.println("INVALID INPUT!");
                scanner.nextLine();
            }
        }

        Customer admin = new Customer(name, money);
        System.out.println("Admin created!");
        System.out.println("Name: "+name);
        System.out.println("Money: "+money);
        return admin;
    }
    private void startMenu(){
        System.out.println("What would you like to do?");
        System.out.println("0 quit");
        System.out.println("1 Go simulate stores ");
        System.out.println("2 Define current user");
        System.out.println("3 About");
    }

    private void about(){
        System.out.println("Welcome to the store program");
        printLine();
        System.out.println("In this program you can simulate multiple stores");
        System.out.println("and transactions between customers and stores");
        printLine();
    }
    private int choice(){
        while(true){
            System.out.println("Your choice: ");
            try{
                return scanner.nextInt();
            }
            catch(Exception e){
                System.out.println("INVALID INPUT!");
                scanner.nextLine();
            }
        }
    }

    private void simulate(){
        System.out.println("Doing the simulation");

        StoreHandler storeHandler = new StoreHandler();
        CustomerHandler customerHandler = new CustomerHandler();
        customerHandler.printCustomers();
        storeHandler.listStores();

        boolean isSimulationOn = true;
        int dayCounter = 1;

        while(isSimulationOn){
            System.out.println("#####Day"+dayCounter+"#####");
            customerHandler.simulateBuyingProducts(storeHandler.getStores());
            isSimulationOn = askSimulationOptions(dayCounter, storeHandler);
            dayCounter++;
        }
    }

    private boolean askSimulationOptions(int dayCounter, StoreHandler storeHandler){
        while(true){
            simulationOptions(dayCounter);
            int choice = choice();
            switch(choice){
                case 0:
                    return false;
                case 1:
                    return true;
                case 2:
                    storeOptions(storeHandler);
                    break;
                case 3:
                    about();
                    break;
            }
        }

    }
    private void simulationOptions(int day){
        System.out.println("What would you like to do?");
        System.out.println("0 quit");
        System.out.println("1 go to day"+(day+1));
        System.out.println("2 Go to the store yourself");
        System.out.println("3 About");
    }

    private void storeOptions(StoreHandler storeHandler){
        while(true){
            System.out.println("What would you like to do?");
            System.out.println("Money left: "+admin.getMoney());
            System.out.println("Chosen store: "+storeHandler.getChosenStoreName());
            System.out.println("0 return");
            System.out.println("1 choose store");
            System.out.println("2 Choose article to buy");
            System.out.println("3 get stores");
            System.out.println("4 get products in specified store");
            System.out.println("5 supply specified store");
            System.out.println("6 About");
            int choice = choice();
            switch(choice){
                case 0:
                    return;
                case 1:
                    System.out.println("Listing stores");
                    storeHandler.listStores();
                    System.out.println("Which store you would like to choose");
                    int c = choice();
                    System.out.println(storeHandler.chooseStore(c));
                    break;
                case 2:
                    System.out.println("Which product you would like to buy?");
                    int id = choice();
                    System.out.println("How many you would like to buy");
                    int amount = choice();
                    storeHandler.chosenStore.sellProduct(id, amount, admin);
                    break;
                case 3:
                    storeHandler.listStores();
                    break;
                case 4:
                    if(storeHandler.chosenStore != null){
                        storeHandler.chosenStore.listProductsInStock();
                    }else{
                        System.out.println("You havent chosen store yet!");
                    }
                    break;
                case 5:
                    if(storeHandler.chosenStore != null){
                        storeHandler.chosenStore.supplyStore();
                    }else{
                        System.out.println("You havent chosen store yet!");
                    }
                    break;
                case 6:
                    about();
                    break;
            }
        }

    }



    private void printLine(){
        System.out.println("-------------------------------------");
    }
    private void clearScreen(){

    }
}
