class Condition 
{
	public static void main(String args[])
	{
		if (5<6)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
		
		
	}
}

//Nested if condition
class Condition
{
	public static void main(String args[])
	{
		if((5<6))
		{
			if(4>8) 
			{
				System.out.println("True");
			}
			if(7<5)
			{
				System.out.println("Mid");
			}
			
		}
		System.out.println("false");
		
		
	}
}

//Nested If-else

class Condition 
{
	public static void main(String args[])
	{
		if(5<4)
		{
			if(4<8)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}
		else
		{
			if(7>8)
			{
				System.out.println("true");
			}
			else 
			{
				System.out.println("False");
			}
		}
	}
}




// Logical And Condition

class Condition
{
	public static void main(String args[])
	{
		if((5<6) && (8<5))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}

//Switch Statement
import java.util.Scanner;
class Condition
{
	public static void main(String args[])
	{
		int a;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the integer");
		a = obj.nextInt();
		switch(a)
		{
		case 1 :
		{
			System.out.println("Monday");
			break;
		}
		case 2 :
		{
			System.out.println("Tuesday");
			break;
		}
		case 3 :
		{
			System.out.println("Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thursday");
			break;
		}
		case 5:
		{
			System.out.println("Friday");
			break;
		}
		case 6: 
		{
			System.out.println("Sataurday");
			break;
		}
		default :
		{
			System.out.println("No day");
			break;
		}
		}
	}
}

