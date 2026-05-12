package com.oops;

public class SmartPhone1 implements Camera,MusicPlayer{
	
	@Override
	public void takePhoto() {
		System.out.println("Take photo ");
	}
	@Override
	public void playMusic() {
		System.out.println("/music player ");
		
	}

	public static void main(String[] args) {
		SmartPhone1 sp = new SmartPhone1();
		sp.takePhoto();
		sp.playMusic();
		
	}

	

}
