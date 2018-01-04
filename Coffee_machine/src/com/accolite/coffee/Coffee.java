package com.accolite.coffee;

import java.util.Scanner;



class Coffee_process{
	
	
	private String coffee_code;
	
	
	Coffee_process(String code){
		
		this.coffee_code = code;
	}
	
	
	
	public void deliver() {
		System.out.println(this.coffee_code +" is being delivered");
	}
	
}

class Latte extends Coffee_process{

	Latte(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}
	
}

class Mocha extends Coffee_process{

	Mocha(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}
	
}

class Espresso extends Coffee_process{

	Espresso(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}
	
}

class Cappuchino extends Coffee_process{

	Cappuchino(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}
	
}


public class Coffee {
	
	public static Coffee_process create_object(String code ) {
		
		
		switch(code) {
		
		case "lat" :
			return new Latte("latte");
			
			
		case "moc":
			return new Mocha("mocha");
			
		case "esp":
			return new Espresso("espresso");
			
		case "cap":
			return new Cappuchino("cappuchino");
		}
		
		return new Coffee_process(code);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Code");
		String code = sc.next();
		
		Coffee_process cp= create_object(code);
		
		cp.deliver();
		
		sc.close();
	}

}

