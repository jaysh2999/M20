package com.tns.java;

class Adarsh extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			   System.out.println("Adarsh Thread");
		}
		try {
			Thread.sleep(3000);
		}
	catch (InterruptedException e) {
}
	}
}



public class JoinDemo 
{
	

	public static void main(String[] args) throws InterruptedException
	{
		Adarsh a=new Adarsh();
		a.start();
		a.join(3000 , 1000);//Amol wants to wait
	
	
	for (int i=0;i<10;i++)
	{
		 System.out.println("Amol Thread");
	}
	}
}