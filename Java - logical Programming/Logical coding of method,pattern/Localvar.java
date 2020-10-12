class Localvar
{
	public static void main(String args[])
	{
		ramp obj = new ramp();
		obj.disp();
		int roll = 10;
		System.out.println("Roll :"+roll);
		
		
		
	}
}

class ramp 
{
	// int exam = 90; Instance variable
	void disp() //method
	{
		int marks = 20;  //Local variable
		System.out.println("Marks :"+ marks);
	}
}