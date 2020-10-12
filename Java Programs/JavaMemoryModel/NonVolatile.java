package JavaMemoryModel;

public class NonVolatile {
	public static void main(String args[])
	{
		VolatileVisibility obj = new VolatileVisibility();
		obj.writeThread();
		obj.readThread();
	}
}

 class VolatileVisibility
{
	 boolean flag = false;
	 
	 public void writeThread()
	 {
		 flag = true;
		 
	 }
	 public void readThread()
	 {
		 while(flag)
		 {
			 System.out.print("Yes");	 
		 }
	 }
}
 //infinite loop
