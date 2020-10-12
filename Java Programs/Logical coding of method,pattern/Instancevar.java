// Instance Variable

class Instancevar
{
	public static void main(String args[])
	{
		Mode obj = new Mode();
		Mode obj1 = new Mode();   //to access the instance var using obj and create copy
		obj.marks = 10;
		obj.roll = 20;
		obj1.marks = 100;
		obj1.roll = 200;
		System.out.println("Marks :"+ obj.marks);
		System.out.println("roll :"+ obj.roll);
		System.out.println("Marks :"+ obj1.marks);
		System.out.println("roll :"+ obj1.roll);
	}
}

class Mode
{
	int roll;
	int marks;
	// int car = 10; // initialize
	
}