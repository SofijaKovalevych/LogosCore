package pac;

public class Wheel {
	private double diametr = 20;
	private String type  ="���";
	
	
	@Override
	public String toString() {
		return "��������  " +diametr+  " ���� -" + type + ";" ;
	}


	public Wheel(double diametr, String type) {
		super();
		this.diametr = diametr;
		this.type = type;
	}


	public double getDiametr() {
		return diametr;
	}


	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		if(type.equalsIgnoreCase("���")|| type.equalsIgnoreCase("�����") || type.equalsIgnoreCase("���������") )
		this.type = type;
		else {
			System.out.println("���� ������ ���� ����!");
		}
	}
	
	public double plusWheel(double k){
		if(k<0.5){
			System.out.println("������ �� ���� ���� ������!");
			return diametr;
		}else{
		diametr *= diametr*k;
		return diametr;
		}
	}
	
	
}
