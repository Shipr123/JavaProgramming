//class Twodarray
//{
//	public static void main(String args[])
//	{
//		int num [][];
//		num = new int[3][4];
//		num[0][0] = 11;
//		num[0][1] = 22;
//		num[0][2] = 33;
//		num[0][3] = 44;
//		num[1][0] = 55;
//		num[1][1] = 66;
//		num[1][2] = 11;
//		num[1][3] = 22;
//		num[2][0] = 33;
//		num[2][1] = 44;
//		num[2][2] = 55;
//		num[2][3] = 66;
//		System.out.println(num[0][2]);
//		
//	}
//}

// Getting Input from User

//2d array Matrix 

import java.util.Scanner;

class Twodarray
{
	public static void main(String args[])
	{
		int num [][] = new int[3][4];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the values :");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				num[i][j] = obj.nextInt();
			}
		}
		System.out.println("You Entered: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(num.length);  //row length
		System.out.println(num[0].length); //column length
		
	}
}
//output
//Enter the values :
//00
//11
//22
//33
//22
//44
//66
//44
//88
//99
//77
//55
//You Entered: 
//0 11 22 33 
//22 44 66 44 
//88 99 77 55 



//Getting Input from User size

//2d dynamic memory allocation array Matrix 

import java.util.Scanner;

class Twodarray
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = obj.nextInt();
		int k = obj.nextInt();
		int num [][] = new int[n][k];
		
		System.out.println("Enter the values :");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<k; j++)
			{
				num[i][j] = obj.nextInt();
			}
		}
		System.out.println("You Entered: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<k; j++)
			{
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(num.length);  //row length
		System.out.println(num[0].length); //column length
		
	}
}

//Output
Enter the size :
3 4
Enter the values :
11
22
33
44
55
66
77
88
99
11
22
33
You Entered: 
11 22 33 44 
55 66 77 88 
99 11 22 33 
3
4
