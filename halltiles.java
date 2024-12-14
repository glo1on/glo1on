import java.util.*;

class halltiles{
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);	    
	
System.out.println("Congrat! You have rescued the robot! All you need to do is escape through the courtyard. \nOh no! The opening of the cell triggered the encrytion of the hallway.\nYou must now navigate from left to right 3 times to make it to the courtyard.\nLuckly for you, the answer for the tiles you have to jump on has already been found,\nyou just have to choose the right option pack.\nSelect option pack 1 or 2 to see if you can get the answer key:");

if(scan.nextInt()==1){
    option one=new option("left","left");
    
    System.out.println(one.pair1+", "+one.pair2);
    System.out.println("Unfortunately you chose the wrong one. You will be sent back to the cell to try again.");
}
else{
     option one=new option("left","right","right");
    
    System.out.println(one.pair1+", "+one.pair2+", "+one.pair3);
    System.out.println("Congrat, you chose the right pack! Proceed to the courtyard.");
}






  
	    
	    
	}
}
