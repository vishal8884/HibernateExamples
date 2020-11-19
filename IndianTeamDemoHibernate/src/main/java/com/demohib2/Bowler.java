package com.demohib2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Bowler extends TeamIndia {

	private String bowlingHand;
	private String bestFigure;
	
	public Bowler(String firstname, String lastname,String bowlingHand, String bestFigure) {
		super(firstname, lastname);
		this.bowlingHand = bowlingHand;
		this.bestFigure = bestFigure;
	}
	
	public String getBowlingHand() {
		return bowlingHand;
	}
	public void setBowlingHand(String bowlingHand) {
		this.bowlingHand = bowlingHand;
	}
	public String getBestFigure() {
		return bestFigure;
	}
	public void setBestFigure(String bestFigure) {
		this.bestFigure = bestFigure;
	}
	
	
	
}
