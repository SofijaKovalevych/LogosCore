package homework4;

public class Main {
	
	private static final int a = 10;
	private static final int b = 15;
	private static final int c = 20;

	public static void main(String[] args) {
		
		minFromThreeAndEqualsFromTwoInt(a, b, c);
	}
	
	private static void minFromThreeAndEqualsFromTwoInt(int a, int b, int c){
		System.out.println("Minimum froim three int: " + minFromTwo(minFromTwo(a, b), c));
		equalsFromTwoInt(a, b);
	}
	
	private static int minFromTwo(int a, int b){
		if(a < b){
			return a;
		}
		return b;
	}
	
	private static void equalsFromTwoInt(double a, double b){
		if(a < b){
			System.out.println("Multiplay a * b equals: " + a * b);
		}else if(a > b){
			System.out.println("Divide a / b equals: " + a / b);
		}else{
			System.out.println("A equals B");
		}
	}

}