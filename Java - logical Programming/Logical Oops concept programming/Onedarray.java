//Getting input from user in One D Array

import java.util.Scanner;
class Onedarray
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int num[] = new int[5];
		System.out.println("Enter 5 Integer Value :");
		for(int i=0; i<5; i++)
		{
			num[i] = obj.nextInt();
		}
		System.out.println("your Integer");
		for(int i=0; i<5; i++)
		{
			System.out.println(num[i]);
		}
	}
}

// One Dimensional Array (Declare,Initialization)
class Onedarray
{
	public static void main(String args[])
	{
	int num[] = {7, 8, 5, 45, 21, 2};
	int mark[];
	mark = num;
	for(int i=0; i<5; i++)
	{
		System.out.println("number :"+ mark[i]);
	}
	
	}
}


// Calculation with Array
class Onedarray
{
	public static void main(String args[])
	{
		int num[] = new int[5];
		num[0] = 11;
		num[1] = 2;
		num[2] = 56+num[1];
		num[3] = num[1]+num[2];
		num[4] = 87;
		for(int i=0; i<5; i++)
		{
			System.out.println("Number"+" ["+ i +"] "+" " + ":" + num[i]);
		}
	}
}

////Output
//Number [0]  :11
//Number [1]  :2
//Number [2]  :58
//Number [3]  :60
//Number [4]  :87


// Dynamic Memory Allocation
import java.util.Scanner;
class Onedarray
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = obj.nextInt();
		int num[] = new int[n];
		System.out.println("Enter" +n+ "Integer Value :");
		for(int i=0; i<n; i++)
		{
			num[i] = obj.nextInt();
		}
		System.out.println("your Integer");
		for(int i=0; i<n; i++)
		{
			System.out.println(num[i]);
			
		}
		System.out.println("Length :"+num.length);
	}
}

// Output
Enter the size :
2
Enter2Integer Value :
4
5
your Integer
4
5
Length :2