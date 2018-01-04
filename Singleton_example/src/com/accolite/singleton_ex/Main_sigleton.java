package com.accolite.singleton_ex;


class Singleton {

	private Singleton() {
		
		System.out.println("in singleton class");
	}
	
	private static Singleton s;
	public static int a = 2,b = 3;
	
	static synchronized Singleton instance() {
		if( s == null) {
			s =  new Singleton();
			a++; 
		}
		b++;
		return s;
	}
	
	
	
	public void display() {
		System.out.println("a : "+ a +" b :"+b);
	}

	

}


public class Main_sigleton extends Thread{

	public void run() {
		
		Singleton s1 = Singleton.instance();
		s1.display();
		Singleton s2 = Singleton.instance();
		s2.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Main_sigleton());
		Thread t2 = new Thread(new Main_sigleton());
		t1.start();
		t2.start();
		
	}
}
