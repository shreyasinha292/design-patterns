package double_lock_check;

//import com.accolite.singleton_ex.Main_sigleton;
//import com.accolite.singleton_ex.Singleton;

class Singleton {

	private Singleton() {
		
		System.out.println("in singleton class double lock");
	}
	
	private static Singleton s;
	public static int a = 2,b = 3;
	
	public static  Singleton instance() {
		if( s == null) {
			synchronized(Singleton.class) {
				if( s == null) {
					s =  new Singleton();
					a++; 
				}
			}
			
			
		}
		b++;
		return s;
	}
	
	
	
	public void display() {
		System.out.println("a : "+ a +" b :"+b);
	}

	

}


public class Double_lock extends Thread {
	
	public void run() {
		
		Singleton s1 = Singleton.instance();
		s1.display();
		Singleton s2 = Singleton.instance();
		s2.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Double_lock());
		Thread t2 = new Thread(new Double_lock());
		t1.start();
		t2.start();
		
	}
}
