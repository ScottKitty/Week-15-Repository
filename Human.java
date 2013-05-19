


public class Human extends Monkey
{
	private int HumanMoves = 20;

	public Human(String StartAnimal, String StartName, String StartGender, int StartAge,
			int StartWeight, int StartSpeed, int StartAcceleration,
			int StartRunningDistance, int StartBodyLiftRatio)
	
	{
		super(StartAnimal, StartName, StartGender, StartAge, StartWeight, StartSpeed,
				StartAcceleration, StartRunningDistance, StartBodyLiftRatio);
	}

	public Human()
	{
		// TODO Auto-generated constructor stub
	}

		// Class Properties // 
		public String SetAnimal(String StartAnimal)
		{
			return StartAnimal = "Human";
		}
		public String SetName(String StartName)
		{
			return StartName = "James Luc";
		}
		public String SetGender(String StartGender)
		{
			return StartGender = "Male";
		}
		public int SetAge(int BiAge)
		{
			BiAge = 20;
			return Age = BiAge;
		}
		public int SetSpeed(int BiSpeed)
		{
			BiSpeed = 20;
			return Speed = BiSpeed;
		}
		public int SetWeight(int BiWeight)
		{
			BiWeight = 150;
			return Weight = BiWeight;
		}
		public int SetAcceleration(int BiAcceleration)
		{
			BiAcceleration = 20;
			return Acceleration = BiAcceleration;
		}
		public int SetRunningDistance(int BiRunningDistance)
		{
			BiRunningDistance = 20;
			return RunningDistance = BiRunningDistance;
		}
		public int SetBodyLiftRatio(int BiBodyLiftRatio)
		{
			BiBodyLiftRatio = 35;
			return BodyLiftRatio = BiBodyLiftRatio;
		}
// Class Methods // 
		public void Talk()
		{
			System.out.println("\n Hello");
		}
		public void Walk()
		{
			HumanMoves -= 1;
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
			HumanMoves -=2;
		}
		public void Collide()
		{
			HumanMoves -=2;
		}
		public void Lift()
		{
			System.out.println( " Can Lift Biped and Monkey");
		}
	


}
