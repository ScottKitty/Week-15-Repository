import java.util.Scanner;
public class Biped 
{
	Scanner input = new Scanner(System.in);
	
	// Class Fields // 
	public String Animal,
					Name,
					Gender;
	public int Age ,
			   Weight,
			   Speed,
			   Acceleration,
			   RunningDistance,
			   BodyLiftRatio;
	private int BipedMoves = 10;
	
	// Biped Class Constructor // 
	public Biped() 
	{
		
	}
	public Biped(String StartAnimal, String StartName, String StartGender, int StartAge, int StartWeight, int StartSpeed, int StartAcceleration, int StartRunningDistance, int StartBodyLiftRatio)
	{
		Animal = StartAnimal;
		Name = StartName;
		Gender = StartGender;
		Age = StartAge;
		Weight = StartWeight;
		Speed = StartSpeed;
		Acceleration = StartAcceleration;
		RunningDistance = StartRunningDistance;
		BodyLiftRatio = StartBodyLiftRatio;
	}
	// Biped Class Properties // 
	public String SetAnimal(String StartAnimal)
	{
		return StartAnimal = "Biped";
	}
	public String SetName(String StartName)
	{
		return StartName = "BipedBillyBob";
	}
	public String SetGender(String StartGender)
	{
		return StartGender = "Male";
	}
	public int SetAge(int BiAge)
	{
		BiAge = 5;
		return Age = BiAge;
	}
	public int SetSpeed(int BiSpeed)
	{
		BiSpeed = 10;
		return Speed = BiSpeed;
	}
	public int SetWeight(int BiWeight)
	{
		BiWeight = 25;
		return Weight = BiWeight;
	}
	public int SetAcceleration(int BiAcceleration)
	{
		BiAcceleration = 5;
		return Acceleration = BiAcceleration;
	}
	public int SetRunningDistance(int BiRunningDistance) 
	{
		BiRunningDistance = 10;
		return RunningDistance = BiRunningDistance;
	}
	public int SetBodyLiftRatio(int BiBodyLiftRatio)
	{
		BiBodyLiftRatio = 25;
		return BodyLiftRatio = BiBodyLiftRatio;
	}
	// Biped Class Methods //
	public void AnimalDescription()
	{
		System.out.println( "\n I am a " + SetAnimal(Animal) +
							"\n My Name is " + SetName(Name) + 
							"\n Gender is " + SetGender(Gender) +
							"\n Age is " + SetAge(Age) + " Years Old" +
							"\n Speed is " + SetSpeed(Speed) + " MPH" + 
							"\n Weight is " + SetWeight(Weight) + " Pounds" +
							"\n Acceleration " + SetAcceleration(Acceleration) + " MPH" +
							"\n Max running distance is " + SetRunningDistance(RunningDistance) + " Miles" + 
							"\n Body Lift Ratio is " + SetBodyLiftRatio(BodyLiftRatio) + " Pounds");
	}
	public void Talk()
	{
		System.out.println("\n WubWubWubWub ");
	}
	public void Walk()
	{
		BipedMoves -= 1;
	}
	public void Turn()
	{
		int direction;
		direction =  1 + (int) (Math.random() * 4);
		
		if (direction == 1)
		{
			System.out.println( "\n Left Turn");
		}
		else if (direction == 2)
		{
			System.out.println( "\n Right Turn");
		}
		else if (direction == 3)
		{
			System.out.println( "\n Up Turn");
		}
		else if(direction == 4)
		{
			System.out.println( "\n Down Turn");
		}
	}
	public void Run()
	{
		BipedMoves -=2;
	}
	public void Collide()
	{
		BipedMoves -=4;
	}
	public void Lift()
	{
		System.out.println( " Cant Lift Much ");
	}
	

}
