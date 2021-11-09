package edu.wccnet.christopherlively.springMVC.controller;

public class RandomNumb {
	int rand;
	
	public int getRand() {
		return rand;
	}
	
	public void generateRandom() {
		rand = (int)(Math.random() *1000 + 1);
		
	}

}
