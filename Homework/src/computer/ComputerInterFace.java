package computer;

public interface ComputerInterFace {
	
	static void computepSyso(Computer computer) {
		double fullprice = fullPrice(computer);
		computer.setPrice(fullprice);
		System.out.println(computer);
		System.out.println("PC fullprice: " + fullprice + "$");
		System.out.println(
				"PC percent price = " + String.format("%.2f", (computer.getCpu().getPrice() * 100) / fullprice) + "%");
	}

	private static double fullPrice(Computer computer) {
		return (double) computer.getPrice() + computer.getCpu().getPrice() + computer.getMouse().getPrice()
				+ computer.getKeyboard().getPrice() + computer.getKeyboard().getPrice();
	}

}
