
import java.util.Scanner;
public class DiceTest
{
  
  public static void main(String[] args)
  {
  	
  	May6 RollDice = new May6();
  	
  	
  	Scanner input = new Scanner(System.in);
  	
  	int one;
  	int two ;
  	int three ;
  	int four;
  	int five;
  	int six;
  	int seven;
  	int eight;
  	String askQuestion = null;
  	
  	
  	do
  	{
  	
  	one = RollDice.RollDice();
  	System.out.printf(" Computer Rolls. Total is %d \n", one);
  	
  	two = RollDice.RollDice();
  	System.out.printf(" Computer Rolls. Total is %d \n", two);
  	
  
  	
 
  	System.out.printf( "Enter how many dice \n");
  	four = input.nextInt();
  	System.out.printf( "Enter max value \n");
  	five = input.nextInt();
  
  	
  	six = May6.RollDice(four, five);
  	System.out.printf(" Total is %d \n", six);
  	
  	
  	System.out.printf ( "Play again ? Y or N. \n\n" );
  	askQuestion = input.next();
  	
  	
  	} 
  	while (askQuestion.equalsIgnoreCase("y"));
  
  	seven = RollDice.RollCountS();
  	eight = RollDice.RollCountM();
  	
  	System.out.printf("Total number of rolls Static %d \n", seven);
  	System.out.printf("Total number of rolls Method %d \n", eight);

  	
  
  }
}