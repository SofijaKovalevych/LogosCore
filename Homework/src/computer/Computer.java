package computer;

public class Computer extends Abstract {

	private Cpu cpu;

	private Mouse mouse;

	private Keyboard keyboard;

	private Monitor monitor;

	public Computer(String name, double price, Cpu cpu, Mouse mouse, Keyboard keyboard, Monitor monitor) {
		super(name, price);
		this.cpu = cpu;
		this.mouse = mouse;
		this.keyboard = keyboard;
		this.monitor = monitor;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return "Computer: " + "\n\tname - " + getName() + "," + " price - " + getPrice() + ";" + "\n\tcpu - " + cpu
				+ ";\n\tmouse - " + mouse + ";\n\tkeyboard - " + keyboard + ";\n\tmonitor - " + monitor;
	}

}
