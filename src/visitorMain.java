import java.util.ArrayList;

public class visitorMain {

	public static void main(String[] args) {
		
		ArrayList<String> cos=new ArrayList<String>();//An ArrayList for cosmetic
		ArrayList<String> med=new ArrayList<String>();//An ArrayList for medicine
		ArrayList<Double> count=new ArrayList<Double>();//An ArrayList for medicine
		ArrayList<String> gen=new ArrayList<String>();//An ArrayList for genosimo
		ArrayList<String> kal=new ArrayList<String>();//An ArrayList for cosmetics in sales
		

		medicine m1=new medicine("���������",15,0.25);
		prescription pr1=new prescription(m1.name,m1.price,m1.sim);
		medicine m2=new medicine("���������",12,1);
		prescription pr2=new prescription(m2.name,m2.price,m2.sim);
		
		cosmetic c1=new cosmetic("Gel ����������",25,1);
		cosmetic c2=new cosmetic("Moisture",32,1);
		cosmetic c3=new cosmetic("Sun Protect",100,1);
		
		cos.add(c1.name);
		cos.add(c2.name);
		cos.add(c3.name);
		med.add(m1.name);
		med.add(m2.name);
		
		pr1.setContr(pr1.name, pr1.sim);
		pr2.setContr(pr2.name, pr2.sim);
		
		int x=med.size();
		
		genosimo g1=new genosimo();
		kalsales k1=new kalsales();
		
		System.out.println("�� ���� ��������� �� ���� ����������: "+cos);
		System.out.println("�� ���� ��������� �� ���� �������: "+med);
		System.out.println("���������");
		
		System.out.println("������ ���� ��������: "+m1.compute(0.3,25));
		System.out.println("������ ���� ��������: "+m2.compute(0.3,12));
		count.add(m1.teliki);
		count.add(m2.teliki);
		
		
		
		System.out.println("���� �����������: "+c1.price(25,2));
		System.out.println("���� �������� �����������: "+c2.price(32,1));
		System.out.println("���� ������ �����������: "+c3.price(100,1));
		System.out.println("���� ��� ����������!");
		m1.Accept(g1);
		c1.Accept(k1);
		
		double sum = 0;
		for(Double d : count)
		    sum += d;
		
		System.err.println("����� ��������: "+count);
		System.err.println("�������� ���� ��������: "+sum);
		
		if (x>=6)
			System.err.println("� �������� ��� �������� �����������");
		else 
			System.err.println("������� �������� ��������.");
	}
	

}
