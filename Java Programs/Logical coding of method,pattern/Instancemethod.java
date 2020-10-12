class Instancemethod 
{
	public static void main(String args[])
	{
		Instancemethod obj  = new Instancemethod();
		obj.disp(); 	 //calling instance method
		System.out.println("Method");
	}
	
	void disp() //instance method
	{
		int a = 10;
		System.out.println(a);
	}
}


// Instance method with parameter

class Instancemethod 
{
	public static void main(String args[])
	{
		Instancemethod obj  = new Instancemethod();
		obj.disp(10, 20); 	 //calling instance method and passing value
		System.out.println("Method");
	}
	
	void disp(int a, int b) //instance method with parameter
	{
		int x = a;
		int y = b;
		int z = x+y;
		System.out.println(z);
	}
}


// Instance method in another class
class Instancemethod 
{
	public static void main(String args[])
	{
		top obj  = new top();
		obj.disp(10); 	 //calling instance method and passing value
		System.out.println("Method");
	}
	
}

class top
{
	void disp(int a) //instance method with parameter
	{
		int x = a;
		int y = 20;
		int z = x+y;
		System.out.println(z);
	}
}

//Method return String with paramenter
class Instancemethod 
{
	public static void main(String args[])
	{
		top obj  = new top();
		System.out.println("Fname :"+obj.add());
		String r = obj.mult("Arora") ;	 //calling instance method and passing value
		System.out.println("Lname :"+r);
	}
	
}

class top
{
	String add() //instance method without parameter
	{
		String x = "Krishan"; //Local Variable
		 //Local Variable
		return x;
	}
	String mult (String p)
	{
		String k = p;
		return k;
	}
}

//Method return value with paramenter
class Instancemethod 
{
	public static void main(String args[])
	{
		top obj  = new top();
		System.out.println("Addition :"+obj.add());
		int r = obj.mult(5) ;	 //calling instance method and passing value
		System.out.println("Square :"+r);
	}
	
}

class top
{
	int add() //instance method without parameter
	{
		int x = 10; //Local Variable
		int y = 20; //Local Variable
		return (x+y);
	}
	int mult (int p)
	{
		int k = p;
		return (k*k);
	}
}

