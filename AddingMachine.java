package cse360assignment02;

public class AddingMachine {
	
	private int total;
	private String words = "0";
	
	public AddingMachine() {
		total = 0; //not needed - included for clarity
	}
	
	public int getTotal() {
		
		return total;
	}
	
	public void add (int value) {
		
		total = total + value;
		
		words += " + " + value;
	}
	
	public void subtract (int value) {
		
		total = total - value;
		
		words += " - " + value;
	}
	
	public String toString() {
		
		return words;
	}
	
	public void clear() {
		
		words = "\n 0";
		total = 0;
	}
 }
