import java.util.ArrayList;



public class Player extends Thing {

    private int energy;

    private ArrayList<Thing> inventory;

    private Room room;
    public Player(String Name, String Description, Room Room, int energy) {
        super(Name, Description);
        this.room= Room;
        this.energy = energy;
        this.inventory = new ArrayList<>();
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public ArrayList<Thing> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Thing> inventory) {
        this.inventory = inventory;
    }

    public void addItemToInventory(Thing item) {
        this.inventory.add(item);
    }

    public void removeItemFromInventory(Thing item) {
        this.inventory.remove(item);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void removeEnergy(int amount) {
        this.energy -= amount;
    }

}
