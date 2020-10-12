import Laptop.Dell;
//Using another classes to create object

// Secondary class 
class Example 
{
	int a,b, total;
	void add()
	{
		total = a + b;
	}
}

class Exam
{
	int x,y,sub;
	void sub()
	{
		sub = x - y;
	}
}

// Main Class
public class Project_1
{
	public static void main(String args[])
	{
		//1 object
		Dell obh = new Dell();
		obh.disp();
		Example obj;
		obj = new Example();
		obj.a = 10;
		obj.b = 20;
		obj.add();
		
		// 2 object
		Exam object = new Exam();
		object.x = 78;
		object.y = 45;
		object.sub();
		
		System.out.println("The addition of two is: " + obj.total);
		System.out.println("The Subtraction of two is: " + object.sub);		
	}
}

//The addition of two is: 30
//The Subtraction of two is: 33