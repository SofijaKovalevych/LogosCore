package homework;

public class Homework{
	public static void main (String args[]){
		double variableOne = 10.23;
        double variableTwo = 12.58;
        
        double mult = variableOne * variableTwo;
        double divi = variableOne / variableTwo;

        System.out.println("mult eq " + mult);
        System.out.println("divi eq " + divi);

        System.out.println();

        multiplay(variableOne, variableTwo);
        divide(variableOne, variableTwo);


	}

	private static void multiplay(double a, double b){
		System.out.println("multiplay equels: " + a*b);
	}

	private static void divide(double a, double b){
		System.out.println("divide equels: " + a/b);
	}
}
