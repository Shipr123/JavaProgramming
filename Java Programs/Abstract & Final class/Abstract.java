class Abstract
{
	public static void main(String args[])
	{
		H objh = new H();     // Calling method of sub class H
		I obji = new I();    // Calling method of sub class I
		objh.disp(); 
		obji.disp();
	}
}

abstract class G        //Super class, Abstract class
{
	abstract void disp();       // Abstract Method
}

class H extends G       //Sub class
{
	void disp()
	{
		System.out.println("Abstract method defines in H class");
	}
}

class I extends G  //Sub class
{
	void disp()
	{
		System.out.println("Abstract method defines in I class");
	}
}