package Thread;


//Create a Thread by extend
class Myclass extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getId() + " Value :" +i);
		}
		//try & catch block
		try {
			Thread.sleep(100);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}



public class Threads_1 {

	public static void main(String args[])
	{
		Myclass obj = new Myclass();
		obj.start();
		Myclass obj1 = new Myclass();
		obj1.start();
	}
}


