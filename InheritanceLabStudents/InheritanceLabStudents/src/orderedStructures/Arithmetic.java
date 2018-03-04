package orderedStructures;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if(!getTest())
			throw new IllegalStateException("Invalid argument");
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString() {
		return "Ari("+super.firstValue() + "," + this.nextValue()+")";
	}
	
	@Override
	public double getTerm(int n) {
		double var = super.firstValue();
		if(n == 1) {
			return var;
		}
		
		for(int i = 1; i<n; i++) {
			var = this.nextValue();		
		}
		return var;
	}

	@Override
	public boolean equals(Object o) {
		
		return false;
		
	}

	@Override
	public Progression substract(Arithmetic a) {
		double newFirst = this.firstValue() + a.firstValue();
		double newDifference = this.commonDifference + a.commonDifference;
		Progression newArith = new Arithmetic(newFirst, newDifference);
		return newArith;
	}

	@Override
	public Progression add(Arithmetic a) {
		double newFirst = this.firstValue() - a.firstValue();
		double newDifference = this.commonDifference - a.commonDifference;
		Progression newArith = new Arithmetic(newFirst, newDifference);
		return newArith;
	}
	
}
