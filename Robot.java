
public class Robot extends Biped
{
	private int RobotMoves = 25;
	
	public Robot(String StartAnimal, String StartName, String StartGender, int StartAge,
			int StartWeight, int StartSpeed, int StartAcceleration,
			int StartRunningDistance, int StartBodyLiftRatio)
	
	{
		super(StartAnimal, StartName, StartGender, StartAge, StartWeight, StartSpeed,
				StartAcceleration, StartRunningDistance, StartBodyLiftRatio);
	}
	
	public Robot()
	{
		// TODO Auto-generated constructor stub
	}

		// Class Properties // 
		public String SetAnimal(String StartAnimal)
		{
			return StartAnimal = "Robot";
		}
		public String SetName(String StartName)
		{
			return StartName = "Bender";
		}
		public String SetGender(String StartGender)
		{
			return StartGender = "Male";
		}
		public int SetAge(int BiAge)
		{
			BiAge = 40;
			return Age = BiAge;
		}
		public int SetSpeed(int BiSpeed)
		{
			BiSpeed = 50;
			return Speed = BiSpeed;
		}
		public int SetWeight(int BiWeight)
		{
			BiWeight = 50;
			return Weight = BiWeight;
		}
		public int SetAcceleration(int BiAcceleration)
		{
			BiAcceleration = 50;
			return Acceleration = BiAcceleration;
		}
		public int SetRunningDistance(int BiRunningDistance)
		{
			BiRunningDistance = 50;
			return RunningDistance = BiRunningDistance;
		}
		public int SetBodyLiftRatio(int BiBodyLiftRatio)
		{
			BiBodyLiftRatio = 50;
			return BodyLiftRatio = BiBodyLiftRatio;
		}

		public void Talk()
		{
			System.out.println("\n Bippity Beep Bop");
		}
		public void Walk()
		{
			RobotMoves -= 1;
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
			RobotMoves -=1;
		}
		public void Collide()
		{
			RobotMoves -=1;
		}
		public void Lift()
		{
			System.out.println( " Can Lift Anything!");
		}

	

}
