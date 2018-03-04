package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Progression p; 
		Progression p2;
		
		
		System.out.println("Testing Fibonaci:"); 
		p = new Fibonacci(); 
		p.printAllTerms(20);
		
		
		System.out.println("\n\n\nTesting Geometric:"); 
		p = new Geometric(2, 3); 
		p.printAllTerms(20);
		
		System.out.println("\n\n\nTesting Arithmetic:"); 
		p = new Arithmetic(3, 4); 
		p.printAllTerms(20);
		
		System.out.println("\n\n\nTesting second Arithmetic:");
		p2 = new Arithmetic(2, 5);
		p2.printAllTerms(20);
		
		Arithmetic a1 = (Arithmetic) p;
		Arithmetic a2 = (Arithmetic) p2;
		
		System.out.println("\n\n\nTesting Arithmetic substraction:");
		a1.substract(a2).printAllTerms(20);
		
		System.out.println("\n\n\nTesting Arithmetic addiition:");
		a1.add(a2).printAllTerms(20);
		
	}

}
