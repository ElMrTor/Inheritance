package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if(!getTest())
			throw new IllegalStateException("Invalid argument");
		current = current * commonFactor; 
		return current;
	}

	@Override
	public String toString() {
		return "Geo("+super.firstValue() + "," + this.nextValue()+")";
	}
	
	@Override
	public double getTerm(int n) {
		double var = super.firstValue();
		if(n ==1) {
			return var;
		}
		
		for(int i = 1; i<n; i++) {
			var = this.nextValue();		
		}
		return var;
	}
	
}
