
class cosmetic extends product{
	
	protected int price,am,teliki,x,y;
	
	public void Accept(Visitor v) {
		v.Visit(this);
	
	}
	public cosmetic(String onoma,int timi, double simme){

		   super(onoma, timi, simme);
		   name=onoma;

	}
	 

	public int price(int pr, int amount) {
		System.out.println("Το καλλυντικό που αγοράστηκε:"+name);
		countCosm();
		System.out.println("Μετρητής καλλυντικών: "+getCounterCosm()+" καλλυντικά αγοράστηκαν.");
		price=pr;
		am=amount;
		teliki=pr*am;
		return teliki;
		
	}
	

	public double getCalcCos() {return teliki;}
	
	 
}
