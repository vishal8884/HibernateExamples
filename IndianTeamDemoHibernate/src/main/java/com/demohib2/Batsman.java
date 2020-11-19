package com.demohib2;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Batsman extends TeamIndia{

	private String battingHand;
	private int highestscore;
	
	
	public Batsman(String firstname, String lastname,String battingHand, int highestscore) {
		super(firstname, lastname);
		this.battingHand = battingHand;
		this.highestscore = highestscore;
	}
	
	
	public Batsman() {
		super();
	}



	public String getBattingHand() {
		return battingHand;
	}
	public void setBattingHand(String battingHand) {
		this.battingHand = battingHand;
	}
	public int getHighestscore() {
		return highestscore;
	}
	public void setHighestscore(int highestscore) {
		this.highestscore = highestscore;
	}
	
	
	
}
