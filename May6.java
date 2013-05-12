
import java.util.Scanner;
public class May6 
{
  private static int numberofrolls = 0;
  public int numberofrollm = 0;
  
  static int RollDice(int dice, int max)
  {
  	numberofrolls += dice;
  	
  	int number;
  	
  	number = dice * max;
  	return 1 + (int) (Math.random() * number);
  
  }
  public int RollDice()
  {
  	numberofrollm ++;
  
  	return 1 + (int) (Math.random() *  6);
  }

  public int RollCountS()
  {
  	return numberofrolls;
  }
  public int RollCountM()
  {
	  return numberofrollm;
  }
}