package com.hammerfactory;

public class AbstractHammerFactory implements HammerFactory {

	@Override
	public BallpeenHammer createbphammer() {
		// TODO Auto-generated method stub
		return new BallpeenHam();
	}

	@Override
	public ClawHammer createclawhammer() {
		// TODO Auto-generated method stub
		return new ClawHam();
	}

	@Override
	public ClubHammer createclubhammer() {
		// TODO Auto-generated method stub
		return new ClubHam();
	}

	
}
