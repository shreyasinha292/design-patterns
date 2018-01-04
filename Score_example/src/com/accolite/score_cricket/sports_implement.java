package com.accolite.score_cricket;

public class sports_implement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Subscribers s1 = new Subscribers("david",21);
		Subscribers s2 = new Subscribers("virat",26);
		Subscribers s3 = new Subscribers("suhani",28);
		Cricket_ c = new Cricket_();
		Football_ f = new Football_();
		BasketBall_ b = new BasketBall_();
		c.setCric_score("100/2");
		f.setF_score("3 - 2");
		b.setB_score("28 - 24");
		//Subscribers.display_();
		c.display();
		f.display();
		b.display();
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		c.setCric_score("200/9");
		s1.display_();
		s2.display_();
		s3.display_();
	}
	
}
