
public class TrippleDice extends May6 
{
	private int points = 0;
	
	public TrippleDice()
	{
		numberofrollm++;
		return;
		
	
	}
	public void Trippledice()
	{
		 numberofrollm =+3;
		 points = 1 + (int) (Math.random() * 18);
	}
	public int ResetCount()
	{
		return numberofrollm * 0;
	}
	public void RollCount()
	{
		System.out.printf(" Number of Rolls. Total is %d \n", numberofrollm);
		System.out.printf(" Number of Points.  Total is  %d \n", points);
	}
	

}
