package com.tns.java;

interface Anonymous
{
	  void show();
}



public class LambdaDemo {

       public static void main(String[] args)	{
    	   Anonymous l=()->
    	   {
    		   
    		   System.out.println("Lambda Demo for Simplification");
    	   };
    	    l.show();
       }
	
}
