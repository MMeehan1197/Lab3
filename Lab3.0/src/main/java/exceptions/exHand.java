package exceptions;

import pokerBase.Hand;

public class exHand extends Exception{
	
	private Hand h;

	public exHand(Hand h) {
		super();
		this.h = h;
	}
	
	
}
