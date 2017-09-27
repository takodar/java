package com.staples.olivepress;

import java.util.ArrayList;

import com.staples.olivepress.olives.Kalamata;
import com.staples.olivepress.olives.Ligurion;
import com.staples.olivepress.olives.Olive;
import com.staples.olivepress.press.OlivePress;

/**
 * This is the main class for my app
 * @author RegTa001
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {

		ArrayList<Olive> olives = new ArrayList<Olive>();
		Olive olive;

		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);

		olive = new Ligurion();
		System.out.println(olive.name);
		olives.add(olive);

		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);

		OlivePress press = new OlivePress();
		press.getOil(olives);

		System.out.println("You got " + press.getTotalOil() + " units of oil");

		press.getOil(olives);

		System.out.println("You got " + press.getTotalOil() + " units of oil");
	
		Kalamata olive1 = (Kalamata)olives.get(0);
		System.out.println("Olive 1 is from: " + olive1.getOrigin());
		
	}

}
