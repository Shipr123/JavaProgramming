class Multilevel_inheritance
{
	public static void main(String args[])
	{
		GrandDaughter obj = new GrandDaughter();
		obj.getdata(45, 56);
		obj.disp();
	}
}

class Dad 
{
	int a, b;
	void getdata(int x, int y)
	{
		 a = x;
		 b = y;
	}
}

class Daughter extends Dad
 {
	 int c = 38;
	 int add()
	 {
		int sum = a+b+c;
		return sum;
	 }
	 
 }
 class GrandDaughter extends Daughter
 {
	 void disp() 
	 {
		 System.out.println("A :"+a);
		 System.out.println("B :"+b);
		 System.out.println("C :"+c);
		 System.out.println("Sum :"+add());
			 
	 }
	 
	 
 }