
public abstract class product {
	String name;
	double price;
	double sim;
	static int counter=0;
	static int counters=0;
	
	public product(String onoma, double timi, double simme) {
		name=onoma;
		price=timi;
		sim=simme;
		
	}
	public void countCosm()
	{
	    counter++;
	    
	}
	
	public static int getCounterCosm() {
	    return counter;
	}
    
	public void countMed()
	{
	    counters++;
	    
	}
	
	public static int getCounterMed() {
	    return counters;
	}
	
	public void setFinPr( double timi){price=timi;} 
	

	public abstract void Accept(Visitor v);

}
