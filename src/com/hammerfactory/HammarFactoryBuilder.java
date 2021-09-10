package com.hammerfactory;

public class HammarFactoryBuilder {

	private BallpeenHammer bh;
	private ClawHammer clawh;
	private ClubHammer clubh;
    
	public HammarFactoryBuilder(HammerFactory factory) {
		bh = factory.createbphammer();
		clawh = factory.createclawhammer();
		clubh = factory.createclubhammer();
	}
	
	public void manufacture()
	{
		bh.create();
		bh.hit();
		
		clawh.create();
		clawh.hit();
		
		clubh.create();
		clubh.hit();
	}
}
