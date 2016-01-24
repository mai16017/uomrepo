
class genosimo extends Visitor {
	
	protected double pr,fin;
	protected double per;
	protected String name;
	protected int counter;
	
	
	public void Visit(medicine elem) {
		pr=elem.getCalcGen()/2;
		name=elem.name;
		count();
		System.out.println("Το γενόσημο φάρμακο που αγοράστηκε:"+name+"(γενόσημο)");
		System.out.println("Μετρητής φαρμάκων: "+counter+" γενόσημα "
				+ "φάρμακα αγοράστηκαν.");
		System.out.println("Τιμή γενόσημου: "+pr);
			
	}


	private int count() {
		 counter++;
		 return counter;
	}
	

}
