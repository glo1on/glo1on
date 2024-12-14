import java.util.Scanner;

// James

public class TextAdventure {

    public static void main(String[] args) {

        Game game = new Game();
        boolean gameRunning = true;

        // Intro added by Glory
System.out.println("Welcome to Pooltopia where the best of the best billiard players reside. Humans and robots\nalike come together to play everyday. Unfortunately, there was an arrest made in Pooltopia\nof your best friend Rob who is a robot because he was just too good! You must now navigate\nthrough the prison that he is being held in to rescue him! Use north(n), south (s), east(e), and\nwest (w) to move throughout the prison. Proceed north (n) to the front entrance.");
        Scanner inputName = new Scanner(System.in);
        System.out.print("Enter your player name: ");

        Player player = new Player(inputName.nextLine(), "", game.getRoom(5), 10);
        game.setMainPlayer(player);

        while (gameRunning) {

            if(player.getEnergy() == 0) {
                System.out.println("GAME. OVER. Unfortunately, you were not skilled enough to complete the quest to retrieve Rob. Rob is going to rust away in prison because of you.");
                gameRunning = false;
                System.exit(0);
            }

            System.out.print("Available Commands: ");
            for (int i=0; i<game.commands.size(); i++) {
                System.out.print("\"" + game.commands.get(i) + "\" ");
            }
            System.out.println();

            Scanner inputCommand = new Scanner(System.in);
            System.out.println("Enter a command:");

            game.procCommand(inputCommand.nextLine());

        }

    }

}
