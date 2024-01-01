import java.util.HashMap;
import java.util.Map;

public class StoreHandler {

    protected Map<Integer, Store> stores = new HashMap<Integer, Store>();
    public Store chosenStore = null;

    protected String[] storeNames = {
            "Kallen kyläkauppa",
            "Le store",
            "Power",
            "Overpowered MilkStore",
            "Prisma",
            "Something-Store",
            "Shitty store",
            "Le kauppa",
            "Fluff-Store"
    };
    protected String[] storeLocations = {
            "Joensuu",
            "Rovaniemi",
            "Helsinki",
            "Jyväskylä",
            "Oulu",
            "Ivalo",
            "Parikkala",
            "Tampere"
    };

    protected String[] headsOfTheStores = {
            "Roope Mac Ankka",
            "Poggers",
            "Pig The Pigman",
            "Something being",
            "Mysterious mandeler",
            "Smell my fingers",
            "Fluffers-being",
            "Mandele"
    };

    public String chooseStore(int option){
        for (Map.Entry<Integer, Store> entry : stores.entrySet()) {
            int key = entry.getKey();
            if(key == option){
                chosenStore = entry.getValue();
                return "Store "+chosenStore.getName()+" choosed";
            }
        }
        return "Specified store not found!";
    }
    public String getChosenStoreName(){
        if(chosenStore == null){
            return "None";
        }else{
            return chosenStore.getName();
        }
    }

    public void listStores(){
        for (Map.Entry<Integer, Store> entry : stores.entrySet()) {
            int key = entry.getKey();
            Store store = entry.getValue();
            System.out.println(key+" "+store.getName());
        }
    }
    public StoreHandler(){
        createStores();
        supplyStores();
    }
    private void createStores(){
        int storeAmount = (int)(Math.random()*4)+1;
        for(int i = 0; i < storeAmount; i++) {
            String storeName = storeNames[(int) (Math.random() * storeNames.length)];
            String storeLocation = storeLocations[(int) (Math.random() * storeLocations.length)];
            String headOfTheStore = headsOfTheStores[(int) (Math.random() * headsOfTheStores.length)];

            Store store = new Store(storeName, storeLocation, headOfTheStore);
            stores.put(i, store);
        }
    }
    private void supplyStores(){
        for (Map.Entry<Integer, Store> entry : stores.entrySet()) {
            int key = entry.getKey();
            Store store = entry.getValue();
            store.supplyStore();
        }
    }
    public Map<Integer, Store> getStores(){
        return stores;
    }

}
