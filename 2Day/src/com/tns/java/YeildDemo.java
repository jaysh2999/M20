package com.tns.java;

class Demo extends Thread //Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			   System.out.println("I Am First Thread");
		      Thread.yield();//stop the excution of child thread and giving chance for the main thread
			
		   }  
	    }
     }


//Thread Schedular
public class YeildDemo 
{
	

	public static void main(String[] args) throws InterruptedException
	{
		Demo t=new Demo();
		t.start();
	
		for (int i=0;i<10;i++)
	{
		 System.out.println("I Am Second Thread");
		 Thread.sleep(500);
	}
	}
}