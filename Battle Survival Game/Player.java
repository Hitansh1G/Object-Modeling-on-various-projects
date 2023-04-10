import java.util.ArrayList;

class Item{
    private String name;
    private int cost;
    public void item(String name){
        this.name=name;
    }
}

class Player{
    private int health;
    private ArrayList<Item> inventory;

    public Player(int health, ArrayList<Item> inventory){
        this.health = health;
        this.inventory = inventory;
    }

    public void pickupitem(Item item){
        inventory.add(item);
    }

    public void dropitem(Item item){
        inventory.remove(item);
    }
    

}