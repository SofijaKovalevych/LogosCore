package exceptionExample;

public class Main {

	public static void main(String[] args) throws MyException {

			try {
				getMyException();
			} catch (MyException e) {
				System.out.println("MyException was caught!!!");
			}finally {
				System.out.println("Final block used!!!");
			}
			System.out.println("MyException was throw!!!");
			getMyException();
	}

	private static void getMyException() throws MyException {
		throw new MyException();
	}

}
