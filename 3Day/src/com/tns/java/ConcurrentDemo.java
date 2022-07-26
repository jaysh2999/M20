package com.tns.java;

import java.util.concurrent.locks.ReentrantLock;
public class ConcurrentDemo {

	public static void main(String[] args) {
		
		ReentrantLock l=new ReentrantLock(); //object 1
		
		l.lock();
		
		System.out.println(l.isLocked());
		
		//l.unlock();
		
		System.out.println(l.isHeldByCurrentThread());
		
		
		System.out.println(l.getHoldCount());
		
		
		System.out.println(l.getQueueLength());
		
		
	}

}
