package com.staples.olivepress.olives;

public class Kalamata extends Olive {

	public Kalamata() {
		super(2);
		this.name = "Kalamata";
		this.flavor = "Grassy";
		this.color = Olive.BLACK;
	}
	
	@Override
	public int crush() {
		System.out.println("crush from subclass");
		return super.crush();
	}
	
	/**
	 * This method is unique to <b>Kalamata</b> olives
	 */
	public String getOrigin(){
		return "Greece";
	}
}
