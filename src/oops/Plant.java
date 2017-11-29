package oops;

public class Plant {
	private String name;

	public Plant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
/*
 * The code will compile if public Plant() { this("fern"); } is added to the
 * Plant class.
 */