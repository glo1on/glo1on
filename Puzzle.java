import java.util.Random;
import java.util.Scanner;

public class Puzzle {

    Game game = new Game();
    Scanner scanner = new Scanner(System.in);

    // Allen
    public boolean Maze(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ahead is the cell containing your friend Rob, he looks happy to see you.");

        System.out.println("Rob: Now that you have the keycard, you can save me from here!");

        System.out.println("Enter any input to continue: ");

        String pause = input.next();

        System.out.println("PrisonOS: You have the maximum security clearance, now answer these personal questions to free this prisoner.");

        System.out.println("You decide to compromise the program instead.");

        System.out.println("Enter any input to continue: ");

        pause = input.next();

        System.out.println("------------------------------------------------------------");

        System.out.println("Instructions: The console will display a series of mazes which you must complete to bypass security measures");

        System.out.println("Your player is represented by a 'Y' character, open spaces are 'o', hazards are 'H', and the goal is 'X' ");

        System.out.println("Enter any input to continue: ");

        pause = input.next();

        System.out.println("Enter a combination of characters (with no spaces) to escape this maze by reaching the goal. You cannot move back to previous spaces.");

        System.out.println("'^' is up, 'v' is down, '<' is left, and '>' is right. So v>v would equal down right down");

        System.out.println("Enter any input to continue: ");

        pause = input.next();

        System.out.println("Beware of hazards as they will detect your presence and kick you out the program.");

        System.out.println("Complete the maze:");

        String [][] maze = {{"X", "H", "o"}, {"o", "Y", "H"}, {"H", "H", "H"}};

        String [][] maze2 = {{"Y", "H", "H"}, {"o", "o", "H"}, {"H", "X", "H"}};

        String [][] maze3 = {{"H", "H", "Y"}, {"H", "H", "o"}, {"X", "o", "o"}};

        String [][] maze4 = {{"H", "H", "X"}, {"H", "H", "o"}, {"Y", "o", "o"}};

        String[][][] mazecomp = {maze, maze2, maze3 , maze4};

        int select = (int) (Math.random()*4);

        String [] solutions = {"<^", "v>v", "vv<<", ">>^^"};

        for(int i = 0; i < 3; i++){

            System.out.print(mazecomp[select][0][i] + " ");



        }

        System.out.println(" ");


        for(int i = 0; i < 3; i++){



            System.out.print(mazecomp[select][1][i] + " ");

        }

        System.out.println(" ");

        for(int i = 0; i < 3; i++){



            System.out.print(mazecomp[select][2][i] + " ");

        }

        System.out.println(" ");


        String path = input.next();




        if(path.contentEquals(solutions[select])){
            return true;

        }

        else{

            System.out.println("You were timed out");
            return false;
        }

    }

    // Cody
    public boolean FrontEntrance() {
        System.out.println("Guard: You think I'll just let you in? Not without solving this riddle first.");
        System.out.println("You see a riddle written on the door:");
        System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("echo")) {
            System.out.println("Congratulations! You solved the puzzle and unlocked the area!");
            // Code to move to the unlocked area
            return true;
        } else {
            System.out.println("Incorrect answer. The area remains locked.");
            return false;
        }
    }

    // Glory
    public boolean Security() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Answer these 3 questions correctly to get the 3 digits you need to add to get the password:");
        Random random = new Random();
//random integer gotten between 1-10
        int passdig1 = random.nextInt(10);
        int passdig2 = random.nextInt(10);
        int passdig3 = random.nextInt(10);
        int pass = passdig1 + passdig2 + passdig3;
//different questions for each possible digit
        switch (passdig1) {
            case 0:
                System.out.println("How many sides does a circle have?");
                break;
            case 1:
                System.out.println("What is the answer of any number to the power of 0?");
                break;
            case 2:
                System.out.println("How many wings does a butterfly have?");
                break;
            case 3:
                System.out.println("How many little pigs were there?");
                break;
            case 4:
                System.out.println("How many heads on Mount Rushmore?");
                break;
            case 5:
                System.out.println("How many sides are on a pentagon?");
                break;
            case 6:
                System.out.println("What is the last digit of the year UMBC was founded?");
                break;
            case 7:
                System.out.println("What is the fourth prime number?");
                break;
            case 8:
                System.out.println("What number is the black ball in pool?");
                break;
            case 9:
                System.out.println("What number is the minute hand of a clock pointed at if it is 15 till 1?");
                break;
        }

        switch (passdig2) {
            case 0:
                System.out.println("What is any number divided by 0?");
                break;
            case 1:
                System.out.println("How many terms did Donald Trump serve?");
                break;
            case 2:
                System.out.println("What number gets the same answer squared and added together?");
                break;
            case 3:
                System.out.println("What is the second prime number?");
                break;
            case 4:
                System.out.println("If you're a quadruplet, you're one of how many?");
                break;
            case 5:
                System.out.println("what is 2 plus 3?");
                break;
            case 6:
                System.out.println("What is 2 time 3?");
                break;
            case 7:
                System.out.println("What is 10 minus 3?");
                break;
            case 8:
                System.out.println("How many sides on an octagon?");
                break;
            case 9:
                System.out.println("How many Supreme Court Justices are there?");
                break;
        }

        switch (passdig3) {
            case 0:
                System.out.println("Square root of 0?");
                break;
            case 1:
                System.out.println("Square root of 1?");
                break;
            case 2:
                System.out.println("Square root of 4?");
                break;
            case 3:
                System.out.println("Square root of 9?");
                break;
            case 4:
                System.out.println("Square root of 16?");
                break;
            case 5:
                System.out.println("Square root of 25?");
                break;
            case 6:
                System.out.println("Square root of 36?");
                break;
            case 7:
                System.out.println("Square root of 49?");
                break;
            case 8:
                System.out.println("Square root of 64?");
                break;
            case 9:
                System.out.println("Square root of 81?");
                break;
        }

        System.out.println("Enter the password:");

        int answer = 0;
        if (scan.hasNextInt()) {
            answer = scan.nextInt();
        } else {
            System.out.println("Invalid Input");
        }

        if (answer == pass) {
            System.out.println("You are correct, you collected the KeyCard and can leave!");
            return true;
        } else {
            return false;
        }
    }

    // Taqi
    public boolean Courtyard() {
        // TODO Auto-generated method stub

        while(true) {
            System.out.println("Oh no! There is yet another guard who you have to defeat via a game of Rock, Paper, Scissors.\nType rock, paper or scissors to make a move");
            System.out.print("Your move: ");

            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();



            int rand = (int)(Math.random()*3);   // Generate random integers in range 0 to 2
            String robots_move = "";
            if(rand == 0) {						//assign each random number in the range to rock paper or scissors
                robots_move = "rock";
                System.out.println("Guards move: rock");
            }
            else if (rand == 1) {
                robots_move = "paper";
                System.out.println("Guards move: paper");
            }
            else if (rand == 2) {
                robots_move = "scissors";
                System.out.println("Guards move: scissors");
            };

            if((command.equals("rock") && robots_move.equals("scissors")) || 		//if your move(command) beats the robots move. You win.
                    (command.equals("scissors") && robots_move.equals("paper")) ||
                    (command.equals("paper") && robots_move.equals("rock"))) {
                System.out.println("You won! You and Rob the robot are free.");
                return true;
                //Continuous loop until the if statement directly above is satisfied
            }
            else if(robots_move.equals(command)) {									//if your command equals what the random number generates you tie
                System.out.println("It's a tie! Try again to leave with Rob the robot");

            }
            else {
                System.out.println("You lost! Try again to leave with Rob the robot"); //if your move(command) can't beat the robots move. You lose.
                return false;
            }

        }
    }

    // Glory
    public boolean Hallway() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Congrats! You have rescued the robot! All you need to do is escape through the courtyard. \nOh no! The opening of the cell triggered the encrytion of the hallway.\nYou must now navigate from left to right 3 times to make it to the courtyard.\nLuckly for you, the answer for the tiles you have to jump on has already been found,\nyou just have to choose the right option pack.\nSelect option pack 1 or 2 to see if you can get the answer key:");
        int path = 0;
        if (scan.hasNextInt()) {
            path = scan.nextInt();
        } else {
            System.out.println("Invalid Input");
        }
        if(path ==  2){
//If option pack 2 is selected, they proceed to the courtyard, if not, they go back to the cell
            Option one=new Option("left","right","right");

            System.out.println(one.pair1+", "+one.pair2+", "+one.pair3);
            System.out.println("Congrats, you chose the right pack! Proceed to the courtyard.");

            return true;
        }
        else{
            Option one=new Option("left","left");

            System.out.println(one.pair1+", "+one.pair2);
            System.out.println("Unfortunately you chose the wrong one. You will be sent back to the cell to try again.");
            return false;
        }
    }
}
