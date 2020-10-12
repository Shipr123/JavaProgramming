import java.util.Scanner;
class Userinput
{
	public static void main (String args[])
	{
		int a;
		float b;
		String str;
		Scanner obj = new Scanner(System.in);
		//String
		System.out.print(" Enter String :");
		str = obj.nextLine();
		System.out.println("String "+str);
		//integer
		System.out.print("Enter Integer :");
		a = obj.nextInt();
		System.out.println("Integer "+a);
		//Float
		System.out.print("Enter float :");
		b = obj.nextFloat();
		System.out.println("Float "+b);
		
	}
}

