//Create a thread using thread class-second technique
package com.tns.java;
class ChildThread extends Thread // Thread
{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Child Thread");
		    Thread.yield();//passes the chance of excution to the main thread
				}

		    }
		

		}


//Thread Scchedule
   public class DemoThread 
{
public static void main(String[] args) 
	{
	     ChildThread t=new ChildThread();
	     t.start();
	
	for(int i=0;i<10;i++)
	 {
		  System.out.println("I am Main Thread");
	}
}
}