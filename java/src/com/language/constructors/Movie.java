package com.language.constructors;

public class Movie {
	String director;
	String producer;
	double budget;
	String hero;
	String heroine;
	String commedian;
	
	Movie(String director){
		this.director = director;
	}
	Movie(Movie m1,String producer){
		this.director = m1.director;
		this.producer = producer;
	}
	Movie(Movie m2,double budget,String hero){
		this.director = m2.director;
		this.producer = m2.producer;
		this.budget = budget;
		this.hero = hero;
	}
	Movie(Movie m3,String heroine,String Commedian){
		this.director = m3.director;
		this.producer = m3.producer;
		this.budget = m3.budget;
		this.hero = m3.hero;
		this.heroine = heroine;
		this.commedian = Commedian;
	}
	
	void show() {
		System.out.println("Director : "+ director);
		System.out.println("Producer : "+ producer);
		System.out.println("budget : "+ budget);
		System.out.println("hero : "+hero);
		System.out.println("heroine : "+ heroine);
		System.out.println("Commedian : "+ commedian);
	}
	

	public static void main(String[] args) {
		
		Movie m1 = new Movie("rajamouli");
		m1.show();
		System.out.println("------------------------------------------");
		
		Movie m2 = new Movie(m1,"SSV");
		m2.show();
		System.out.println("------------------------------------------");

		
		Movie m3 = new Movie(m2,500000.00,"Mahesh");
		m3.show();
		System.out.println("------------------------------------------");
		
		Movie m4 = new Movie(m3,"priyanka chpra","brahmi");
		m4.show();
		System.out.println("------------------------------------------");

	}

}
