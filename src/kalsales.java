
class kalsales extends Visitor {
	
	protected double price,am;
	protected double percent;
	protected String name;
	
	public void Visit(cosmetic elem) {
		name=elem.name;
		price=elem.getCalcCos()-elem.getCalcCos()*0.35;
		System.out.println("�� ���������� �� ������� ��� ����������:"+name);
		System.out.println("��� ���� �����������: "+price);
	}

	
}
