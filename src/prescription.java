public class prescription extends medicine {
	
	
	 double contri;
	
	
	
	public prescription(String onoma, double timi, double simme) {
		super(onoma, timi, simme);
		name=onoma;
		price=timi;
		per=simme;
	}
	
	
	
	public void setContr(String n,double contr) {
		
		
		contri=per;
		System.out.println("Το φάρμακο "+name+" έχει "+per+" συμμετοχή απ΄τον "
				+ "ασφαλισμένο");
		
	}
}