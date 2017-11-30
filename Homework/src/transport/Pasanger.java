package transport;

public class Pasanger {
	
	private String name;
	
	private AbsTranstort transport;

	public Pasanger(String name, AbsTranstort transport) {
		this.name = name;
		this.transport = transport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AbsTranstort getTransport() {
		return transport;
	}

	public void setTransport(AbsTranstort transport) {
		this.transport = transport;
	}
	
	@Override
	public String toString() {
		return "I ma: " + name + ", " + "I am in: " + transport.getName() + 
				", " + "With me: " + transport.getPesengers() + " piaces of fresh shit," + " "
						+ "and this shit has " + transport.getWhells() + " whells";
	}

}
