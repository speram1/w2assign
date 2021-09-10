package com.hammerfactory;

public class HammerFactoryTest {
	public static void main(String[] args) {   
		
		HammarFactoryBuilder hb;
		HammerFactory factory;
		
		factory = new AbstractHammerFactory();
		hb = new HammarFactoryBuilder(factory);
	    hb.manufacture();
	 }    

}
