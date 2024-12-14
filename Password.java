import java.util.*;

class Password{
   public static void main( String args[] ) {
    Scanner scan= new Scanner(System.in);
    
    
System.out.println("Answer these 3 questions correctly to get the 3 digits you need to add to get the password:");
    Random random = new Random();
 
int passdig1= random.nextInt(10);
int passdig2= random.nextInt(10);
int passdig3= random.nextInt(10);
int pass=passdig1+passdig2+passdig3;
//System.out.println(pass);

switch(passdig1){
     case 0: System.out.println("How many sides does a circle have?");
        break;
     case 1: System.out.println("What is the answer of any number to the power of 0?");
        break;
     case 2: System.out.println("How many wings does a butterfly have?");
        break;
     case 3: System.out.println("How many little pigs were there?");
        break;
     case 4: System.out.println("How many heads on Mount Rushmore?");
        break;
     case 5: System.out.println("How many sides are on a pentagon?");
        break;
     case 6: System.out.println("What is the last digit of the year UMBC was founded?");
        break;
     case 7: System.out.println("What is the fourth prime number?");
        break;
     case 8: System.out.println("What number is the black ball in pool?");
        break;
     case 9: System.out.println("What number is the minute hand of a clock pointed at if it is 15 till 1?");
        break;
}

switch(passdig2){
     case 0: System.out.println("What is any number divided by 0?");
        break;
     case 1: System.out.println("How many terms did Donald Trump serve?");
        break;
     case 2: System.out.println("What number gets the same answer squared and added together?");
        break;
     case 3: System.out.println("What is the second prime number?");
        break;
     case 4: System.out.println("If you're a quadruplet, you're one of how many?");
        break;
     case 5: System.out.println("what is 2 plus 3?");
        break;
     case 6: System.out.println("What is 2 time 3?");
        break;
     case 7: System.out.println("What is 10 minus 3?");
        break;
     case 8: System.out.println("How many sides on an octagon?");
        break;
     case 9: System.out.println("How many Supreme Court Justices are there?");
        break;
}

switch(passdig3){
     case 0: System.out.println("Square root of 0?");
        break;
     case 1: System.out.println("Square root of 1?");
        break;
     case 2: System.out.println("Square root of 4?");
        break;
     case 3: System.out.println("Square root of 9?");
        break;
     case 4: System.out.println("Square root of 16?");
        break;
     case 5: System.out.println("Square root of 25?");
        break;
     case 6: System.out.println("Square root of 36?");
        break;
     case 7: System.out.println("Square root of 49?");
        break;
     case 8: System.out.println("Square root of 64?");
        break;
     case 9: System.out.println("Square root of 81?");
        break;
}

System.out.println("Enter the password:");

if(scan.nextInt()==pass){
    System.out.println("You are correct, you can collect the keycard and leave!");
}

else{
    System.out.println("You are wrong. Try again.");
}

}
}
