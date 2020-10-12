package Thread.JoinThread;

public class JoinThread {
	private static int count = 0;
	public static synchronized void incount(){
		count++;   //in java every object has aaccess(intrinsic) lock which will give permission to only one thread at a time
	} 
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Runnable()
				{
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					incount();  
					//count = count+1;
				}
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
				});
//Thread
		Thread t2 = new Thread(new Runnable()
		{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			incount();
		}
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		});
		
		t1.start();  //This thread will not wait for the loop it will give the value 0
		t2.start();
		
		try {  //java Thread join method can be used to pause the current thread execution unitl the specified thread is dead
			t1.join(); // this join wait for the thread to complete
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("value :"+count);
	}
	
}
