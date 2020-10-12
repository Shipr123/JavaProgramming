package Thread;
// creating a thread by implementing runnable interface

class Toclass implements Runnable
{
	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getId()+" values :" + i);
		}
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class Threads_2 {
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Toclass());  // it will create a thread obj for Toclass
		Thread t2 = new Thread(new Toclass());
		t1.start();
		t2.start();
	}
}
