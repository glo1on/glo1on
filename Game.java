import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Silas

public class Game {

    private Player mainPlayer;
    // create ArrayList to hold rooms.
    private ArrayList <Room>map; // List of Rooms

    // booleans for puzzles to be activated when player first enters room.
    boolean frontPuzzle = false;
    boolean securityPuzzle = false;
    boolean cellPuzzle = false;
    boolean courtyardPuzzle = false;
    boolean hallwayPuzzle = false;
    boolean playerHasRobot = false;
    boolean playerhasApple = false;
    boolean playerHasKeyCard = false;

    List<String> commands = new ArrayList<>(Arrays.asList(
            "info", "look" , "take" , "apple" ,
            "n" , "s" , "e" , "w"
    ));

    public Game() {
        this.map = new ArrayList<Room>();

        // Add rooms to the map, guide is below
        //          Room(Name, Description, N, S, E, W)
        // Room descriptions added by Glory
        map.add(new Room("Front Entrance", "The view of this place is very grey and metallic.You are at the front entrance. The walls look as if they tower to the sky.\nYou can see a guard. You can proceed north (n) to get to the hallway. The hallway gives you access to the other rooms. ", 1, 5,Direction.DEADEND,Direction.DEADEND));
        map.add(new Room("Hallway", "Metal.Everywhere. The floors are tiled, there's the Security Room to your right, the cell that holds your friend Rob\njust ahead, and the Courtyard to your left.", 4, 0,3,2));
        map.add(new Room("Courtyard", "Freedom never smelt any better. Waterfalls cascading, drones flying free. You're in the Courtyard! Another view of Pooltopia\nis visible where you can see nature!🌈", Direction.DEADEND, Direction.DEADEND,1,Direction.DEADEND));
        map.add(new Room("Security Room", "Full control. This is where everything goes down. The Security Room. Walls on walls of different control panels.\nDon't you dare touch anything you don't need. A keycard is visible.", Direction.DEADEND, Direction.DEADEND,Direction.DEADEND,1));
        map.add(new Room("Cell", "Sad and lonely. Can't believe Rob had to stay here. Reinforced with vanadium, columns on columns of it.\nThe top of the cell isn't even visible.", Direction.DEADEND, 1,Direction.DEADEND,Direction.DEADEND));
        map.add(new Room("Street", "Why are you here?! You have made it to the streets! You have a view of Pooltopia with it's skyscrapers\nand you see billboards of the top billiard players all around. Some used to be occupied with Rob's face.\nProceed north (n) to the frontentrance of the prison to rescue Rob!", 0, Direction.DEADEND,Direction.DEADEND,Direction.DEADEND));

        //create apple
        Thing Apple = new Thing("Apple", "Food Item");
        map.get(5).addItem(Apple);
    }

    ArrayList getMap() {
        return map;
    }

    void setMap(ArrayList Map) {
        map = Map;
    }

    public Room getRoom(int index) {
        return map.get(index);
    }

    public Player getMainPlayer() {
        return mainPlayer;
    }

    public void setMainPlayer(Player mainPlayer) {
        this.mainPlayer = mainPlayer;
    }

    // Move the player a room corresponding to the command input.
    // Silas + James
    void movePlayerTo(Player j,Room room) {
        j.setRoom(room);
    }

    int moveThingto(Player player,Direction dir) {
        Room R = player.getRoom();
        int exit;

        switch (dir) {
            case NORTH:
                exit = R.getN();
                break;
            case SOUTH:
                exit = R.getS();
                break;
            case EAST:
                exit = R.getE();
                break;
            case WEST:
                exit = R.getW();
                break;
            default:
                exit = Direction.DEADEND;
                break;
        }
        if (exit != Direction.DEADEND) {
            movePlayerTo(player, map.get(exit));
        }
        return exit;
    }

    public int moveJohnTo (Direction dir) {
       return moveThingto(mainPlayer, dir);
    }

    private void moveN() {
        MoveRoom(moveJohnTo(Direction.NORTH));
    }

    private void moveS() {
        MoveRoom(moveJohnTo(Direction.SOUTH));
    }

    private void moveE() {
        MoveRoom(moveJohnTo(Direction.EAST));
    }

    private void moveW() {
        MoveRoom(moveJohnTo(Direction.WEST));
    }


    // Silas
    private void look() {
        Room R = mainPlayer.getRoom();
        System.out.println(R.getDescription());
    }

    void MoveRoom (int roomName) {
        String moving;
        if (roomName == Direction.DEADEND) {
            moving = "There isn't a path this way";
        } else {
            Room R = mainPlayer.getRoom();
            moving = "You are now in the " + R.getName() + ". ";
        }
        System.out.println(moving);
    }


    // James
    // Processes the command the user inputs then moves them to the corresponding room
    // trigger a puzzle if it is the player's first time in the new.
    public void procCommand(String command) {

        switch (command) {
            case "n":
                moveN();
                roomScript(mainPlayer);
                break;
            case "s":
                moveS();
                roomScript(mainPlayer);
                break;
            case "e":
                moveE();
                roomScript(mainPlayer);
                break;
            case "w":
                moveW();
                roomScript(mainPlayer);
                break;
            case "info":
                displayInfo(mainPlayer);
                break;
            case "look":
                look();
                break;
            case "take":
                take();
                break;
            case "apple":
                gainEnergy(mainPlayer);
                break;
            default:
                System.out.println("Command invalid, try again");
                break;
        }
    }

    // James
    public void take() {
        boolean tookItem = false;
        Room r = mainPlayer.getRoom();
        List<Thing> itemsInRoom = r.getItems();
        for (int i=0; i<itemsInRoom.size(); i++) {
            Thing item = itemsInRoom.get(i);
            mainPlayer.addItemToInventory(item);
            r.removeItem(item);
            System.out.println("You took: " + item.getName() + "!");
            tookItem = true;
            playerhasApple = true;
        }

        if (!tookItem) {
            System.out.println("You did not take anything.");
        }
    }

    // James
    public void displayInfo(Player player) {

        ArrayList<Thing> inventory = player.getInventory();

        System.out.println("Name: " + player.getName());
        System.out.println("Energy Level: " + player.getEnergy());
        System.out.println("----------------");
        System.out.println("Inventory:");
        for (int i=0; i<inventory.size(); i++) {
            System.out.println("- " + inventory.get(i).getName());
        } 
        System.out.println("----------------");

    }

    // James
    // Check which room the player is in and if they have completed the puzzle for that room, if not then it will play.

    public void roomScript(Player player) {

        Room currentRoom = player.getRoom();
        Puzzle puz = new Puzzle();

        switch (currentRoom.getName()) {
            case "Front Entrance":
                if (!frontPuzzle) {
                    if(puz.FrontEntrance()) {
                        frontPuzzle = true;
                    }
                    else {
                        frontPuzzle = false;
                        loseEnergy(mainPlayer);
                        System.out.println("You got sent back to the previous room.");
                        moveS();
                    }
                    break;
                } else {
                    break;
                }
            case "Hallway":
                if (!hallwayPuzzle && playerHasRobot) {
                    if(puz.Hallway()) {
                        hallwayPuzzle = true;
                    }
                    else {
                        hallwayPuzzle = false;
                        loseEnergy(mainPlayer);
                        System.out.println("You got sent back to the previous room.");
                        moveN();
                    }
                    break;
                } else {
                    break;
                }
            case "Courtyard":
                if (!courtyardPuzzle && playerHasRobot) {
                    if(puz.Courtyard()) {
                        courtyardPuzzle = true;
                    } else {
                        courtyardPuzzle = false;
                        loseEnergy(mainPlayer);
                        System.out.println("You got sent back to the previous room.");
                        moveE();
                    }
                    break;
                }
                else {
                    break;
                }
            case "Cell":
                if (!cellPuzzle && playerHasKeyCard) {
                    if(puz.Maze()) {
                        cellPuzzle = true;
                        System.out.println("Congrats! Now go to the courtyard to leave.");
                        playerHasRobot = true;
                    } else {
                        cellPuzzle = false;
                        loseEnergy(mainPlayer);
                        System.out.println("You got sent back to the previous room.");
                        moveS();
                    }
                    break;
                } else if (!cellPuzzle && !playerHasKeyCard) {
                    System.out.println("I need a KeyCard to free Rob, I should check the security room.");
                    break;
                } else {
                    break;
                }
            case "Security Room":
                if (!securityPuzzle) {
                    if(puz.Security()) {
                        securityPuzzle = true;
                        playerHasKeyCard = true;
                    } else {
                        securityPuzzle = false;
                        loseEnergy(mainPlayer);
                        System.out.println("You got sent back to the previous room.");
                        moveW();
                    }
                    break;
                }
                else {
                    break;
                }
        }

    }

    // James
    private void loseEnergy(Player player) {

        int currentEnergy = player.getEnergy();
        player.setEnergy(currentEnergy - 1);
        int newEnergy = player.getEnergy();

        System.out.println("You have lost energy! You now have " + newEnergy + " Energy Points left!");

    }


    // Allen
    private void gainEnergy(Player player) {

        ArrayList<Thing> inventory = player.getInventory();

        if (playerhasApple) {

            int currentEnergy = player.getEnergy();
            player.setEnergy(currentEnergy + 90);
            int newEnergy = player.getEnergy();

            System.out.println("You restored energy! You now have " + newEnergy + " Energy Points left!");
            inventory.remove(0);
            playerhasApple = false;
        } else {
            System.out.println("You do not have an apple.");
        }
    }

}