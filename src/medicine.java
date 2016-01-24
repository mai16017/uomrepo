
class medicine extends product {
	
	protected String name;
	protected double price,teliki;
	protected double per;
	
	
	public void Accept(Visitor v) {
		v.Visit(this);
	}
	public medicine(String onoma, double timi, double simme) {
		 super(onoma, timi, simme);
		 name=onoma;
	}
	public double compute(double cont, double pr) {
		
		System.out.println("Το φάρμακο που αγοράστηκε:"+name);
		countMed();
		System.out.println("Μετρητής φαρμάκων: "+getCounterMed()+" φάρμακα αγοράστηκαν.");
		per=cont;
		price=pr;
		teliki=price-(per*price);
		return teliki;
		
	}
	
	
	
	
	public double getCalcGen() {return teliki;}
}
