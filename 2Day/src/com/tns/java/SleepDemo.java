//Java program for a sleep()method
package com.tns.java;

class User extends Thread //Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			//system.out.println(i);
			   System.out.println("User Thread");
			   try 
			   {
		             Thread.sleep(1000);//stop working for specific amount of time
			
		   }  
			    catch(InterruptedException e) {
			 System.out.println("e");
			   }
			   System.out.println(i);
	      
		     }
         }



public class SleepdDemo 
{
	

	public static void main(String[] args) throws InterruptedException
	{
		//Main thread
		User u=new User();
		u.start();// To start a thread
	}
		
	}
}