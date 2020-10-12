// Creation of Interface
class Interface
{
	public static void main(String args[])
	{
		
	}
}

interface J
{
	public static final int marks = 10;
	int roll = 45;
	public void disp();
	void putdata();
	int add(int x, int y);
	
}

// One interface extend One interface

interface J
{
	public static final int marks = 10;
	int roll = 45;
	public void disp();
	void putdata();
	int add(int x, int y);
	
}

interface K extends J
{
	void putdata();
	int attendance = 76;
}


// One interface extended by more than one

interface Associate 
{
	public static final int marks = 9;
	int roll = 89;
	public void disp();
	void pull();
	int add(int x, int y);
	
}

interface Manager
{
	int a = 87;
	void ab();
}

interface Department extends Associate, Manager
{
	int attandence = 6;
	void putdata();
}

// One Class Implements one interface 
 class Interface
 {
	 public static void main(String args[])
	 {
		 Student obj = new Student();
		 obj.disp();   // Calling a disp() method from Faculty interface
	 }
 }
 
 interface Faculty
 {
	 public static final int marks = 45;
	 int roll = 34;
	 void disp();
	 void putdata();
 }
 
 class Student implements Faculty
 {
	 int marks1 = 45;
	 int sum = Faculty.marks + marks1;
	 public void disp()    // Always write public before implement method
	 {
		 System.out.println("Roll :"+Faculty.roll);
		 System.out.println("Total Mark :"+ sum);
		 
	 }
	 public void putdata() {}   // define putdata method 
 }
 
// One Class Implements more than one interface 
 
 class Interface
 {
	 public static void main(String args[])
	 {
		 Manager obj = new Manager();
		 obj.disp();
		 obj.add();
	 }
 }
 
 interface Associate
 {
	 public static final int marks = 90;
	 int roll = 6;
	 void disp();
 }
 
 interface Executive
 {
	 int marks1  = 4;
	 void add();
 }
 
 class Manager implements Associate, Executive
 {
	 int sum = Associate.marks + Executive.marks1;
	 
	 public void disp()
	 {
		 System.out.println("Roll :" +Associate.roll);
	 }
	 
	 public void add()
	 {
		 System.out.println("Total Marks :"+ sum);
	 }
 }