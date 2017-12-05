package pac;

public class Wheel {
	private double diametr = 20;
	private String type  ="літні";
	
	
	@Override
	public String toString() {
		return "діаметром  " +diametr+  " типу -" + type + ";" ;
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
		if(type.equalsIgnoreCase("літні")|| type.equalsIgnoreCase("зимові") || type.equalsIgnoreCase("всезезонні") )
		this.type = type;
		else {
			System.out.println("немає такого типу коліс!");
		}
	}
	
	public double plusWheel(double k){
		if(k<0.5){
			System.out.println("Колесо не може бути меншим!");
			return diametr;
		}else{
		diametr *= diametr*k;
		return diametr;
		}
	}
	
	
}
