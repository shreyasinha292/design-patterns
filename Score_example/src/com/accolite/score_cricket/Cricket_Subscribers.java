package com.accolite.score_cricket;


import java.util.ArrayList;



interface Subscribe{
	
	public void notify_cric(String score);
	public void notify_fball(String score);
	public void notify_bball(String score);
}



class Observer extends Subscribers implements Subscribe{
	
	
	Observer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	Observer(){
		
	}

	String score;

	
		
	public void notify_cric(String score) {
		
		for(Subscribers s: subs_list ) {
			s.get_update_c(score);			
		}
	}
	
	public void notify_fball(String score) {
		
		for(Subscribers s: subs_list ) {
			s.get_update_f(score);			
		}
	}
	
	public void notify_bball(String score) {
		
		for(Subscribers s: subs_list ) {
			s.get_update_b(score);			
		}
	}
	
}


class Cricket_ extends Observer{

	Cricket_(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	Cricket_(){
		
	}

	String cric_score;
	
	public String getCric_score() {
		return cric_score;
	}

	public void setCric_score(String cric_score) {
		this.cric_score = cric_score;
		notify_cric(cric_score);
	}

	public void display() {
		for(Subscribers s: subs_list ) {
			System.out.println("the score for the current cricket game for "+s.name +" is "+ cric_score);			
		}
	}

}

class Football_ extends Observer{

	Football_(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	Football_(){
		
	}

	String f_score;

	
	public String getF_score() {
		return f_score;
	}

	public void setF_score(String f_score) {
		this.f_score = f_score;
		notify_fball(f_score);
	}

	public void display() {
		for(Subscribers s: subs_list ) {
			System.out.println("the score for the current football game for "+s.name +" is "+ f_score);			
		}
	}

}

class BasketBall_ extends Observer{

	BasketBall_(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	BasketBall_(){
		
	}

	String b_score;

	public String getB_score() {
		return b_score;
	}

	public void setB_score(String b_score) {
		this.b_score = b_score;
		notify_bball(b_score);
	}


	public void display() {
		for(Subscribers s: subs_list ) {
			System.out.println("the score for the current basketball game for "+s.name +" is "+ b_score);			
		}
	}

}
 
class Subscribers{
	
	String name;
	int age;
	String cricscore;
	String fscore;
	String bscore;
	
	public static ArrayList<Subscribers> subs_list = new ArrayList<Subscribers>();
	
	Subscribers(){
		
	}
	Subscribers(String name, int age){
		this.name = name;
		this.age = age;
		subs_list.add(this);
	}
	
	void display_() {
		System.out.println("the score for the current football game for "+name +" is "+ fscore);	
		System.out.println("the score for the current cricket game for "+name +" is "+ cricscore);			
		System.out.println("the score for the current basketball game for "+name +" is "+ bscore);			
		
	}
	
	public void get_update_c(String score) {
		this.cricscore = score;
	}
	
	public void get_update_f(String score) {
		this.fscore = score;
	}
	
	public void get_update_b(String score) {
		this.bscore = score;
	}
}

