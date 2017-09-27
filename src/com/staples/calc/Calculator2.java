package com.staples.calc;

import com.staples.calc.helpers.InputHelper;
import com.staples.calc.helpers.MathHelper;

public class Calculator2 {
	
	public static void main(String[] args) {
		String fullLastName = "";
		for (int i = 0; i < 15; i++) {
			if(i < 15){
				System.out.flush();
			String s1 = InputHelper.getInput("Enter your last name: ");
			
			try {
				if(s1.length() > 1){
					int exit = Integer.parseInt(s1);
					if(exit == -1){
						System.out.println("Last Name Entered is: " + fullLastName);
						break;
					}
					throw new ArithmeticException();
				}
				int exit = Integer.parseInt(s1);
				if(exit == -1){
					System.out.println("Last Name Entered is: " + fullLastName);
					break;
				}
				fullLastName = fullLastName + s1;
			}
			catch (ArithmeticException e) {
				System.out.println("Must enter 1 character at a time");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			

			}
			else{
				String s = InputHelper.getInput("Final Question:  ");
				System.out.println("Last Name Is: " + s);
			}

			}
		
//		String s1 = InputHelper.getInput("Enter a numeric value: ");
//		String s2 = InputHelper.getInput("Enter a numeric value: ");
//		String op = InputHelper.getInput("Enter 1=Add, 2=Subtract, 3=Multiply, 4=Divide");
//
//		
//		int opInt = Integer.parseInt(op);
//		double result = 0;
//		switch (opInt) {
//		case 1:
//			result = MathHelper.addValues(s1, s2);
//			break;
//		case 2:
//			result = MathHelper.subtractValues(s1, s2);
//			break;
//		case 3:
//			result = MathHelper.multiplyValues(s1, s2);
//			break;
//		case 4:
//			result = MathHelper.divideValues(s1, s2);
//			break;
//
//		default:
//			System.out.println("Please enter between 1 and 4");
//			break;
//		}
//
//		System.out.println("ANSWER IS " + result);
		
		
		
//		System.out.println(MathHelper.addMultipleValues(2.0,40.99,99.98,42.6));

	}
}


