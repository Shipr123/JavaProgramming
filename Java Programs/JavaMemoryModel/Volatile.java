package JavaMemoryModel;

public class Volatile {
	public static void main(String args[])
	{
		Vol obj = new Vol();
		obj.writeThread();
		obj.readThread();
	}
}

 class Vol
{
	volatile boolean flag = false;
	 
	 public void writeThread()
	 {
		 flag = true;
		 
	 }
	 public void readThread()
	 {
		 while(flag)
		 {
//			 
//			 System.out.print("Yes");	 
		 }
	 }
}
