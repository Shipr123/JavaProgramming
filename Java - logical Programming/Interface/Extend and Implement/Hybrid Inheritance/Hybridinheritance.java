class Hybridinheritance
{
	public static void main (String args[])
	{
		Result obj = new Result();
		obj.disp();
	}
}

class Students 
{
	int roll = 101;
	int practical = 50;
	
}

class Exams extends Students
{
	int theory = 100;
	int pm =  theory + practical;
}

interface Project
{
	int pmark = 200;  //Public Static final
	void disp();   //Abstract Method
}

class Result extends Exams implements Project   //Extend an Implement togethor
{
	int sum = pm + Project.pmark;
	public void disp()
	{
		System.out.println("Roll =" +roll);
		System.out.println("theory =" +theory);
		System.out.println("practical =" +practical);
		System.out.println("Project =" +Project.pmark);
		System.out.println("Total marks =" +sum);
	}
}