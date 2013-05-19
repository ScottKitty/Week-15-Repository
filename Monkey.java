
public class Monkey extends Biped
{

	private int MonkeyMoves = 15;
	public Monkey(String StartAnimal, String StartName, String StartGender, int StartAge,
			int StartWeight, int StartSpeed, int StartAcceleration,
			int StartRunningDistance, int StartBodyLiftRatio)
	
	{
		super(StartAnimal, StartName, StartGender, StartAge, StartWeight, StartSpeed,
				StartAcceleration, StartRunningDistance, StartBodyLiftRatio);
	}

	
	public Monkey()
	{
		
	}
	// Class Properties // 
	public String SetAnimal(String StartAnimal)
	{
		return StartAnimal = "Monkey";
	}
	public String SetName(String StartName)
	{
		return StartName = "Kong";
	}
	public String SetGender(String StartGender)
	{
		return StartGender = "Male";
	}
	public int SetAge(int BiAge)
	{
		BiAge = 15;
		return Age = BiAge;
	}
	public int SetSpeed(int BiSpeed)
	{
		BiSpeed = 15;
		return Speed = BiSpeed;
	}
	public int SetWeight(int BiWeight)
	{
		BiWeight = 30;
		return Weight = BiWeight;
	}
	public int SetAcceleration(int BiAcceleration)
	{
		BiAcceleration = 10;
		return Acceleration = BiAcceleration;
	}
	public int SetRunningDistance(int BiRunningDistance)
	{
		BiRunningDistance = 15;
		return RunningDistance = BiRunningDistance;
	}
	public int SetBodyLiftRatio(int BiBodyLiftRatio)
	{
		BiBodyLiftRatio = 30;
		return BodyLiftRatio = BiBodyLiftRatio;
	}
// Class Methods // 
	public void Talk()
	{
		System.out.println("\n Ooh ooh Ahh Ahh");
	}
	public void Walk()
	{
		MonkeyMoves -= 1;
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
		MonkeyMoves -=2;
	}
	public void Collide()
	{
		MonkeyMoves -=3;
	}
	public void Lift()
	{
		System.out.println( " Can lift Biped");
	}

}
