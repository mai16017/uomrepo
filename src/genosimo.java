
class genosimo extends Visitor {
	
	protected double pr,fin;
	protected double per;
	protected String name;
	protected int counter;
	
	
	public void Visit(medicine elem) {
		pr=elem.getCalcGen()/2;
		name=elem.name;
		count();
		System.out.println("�� �������� ������� ��� ����������:"+name+"(��������)");
		System.out.println("�������� ��������: "+counter+" �������� "
				+ "������� �����������.");
		System.out.println("���� ���������: "+pr);
			
	}


	private int count() {
		 counter++;
		 return counter;
	}
	

}
