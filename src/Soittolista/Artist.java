package Soittolista;

public class Artist {

	private String name;
	private int yearOfBirth;

	public Artist(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getYearOfBirth() {

		return yearOfBirth;

	}

	public void setYearOfBirth(int yearOfBirth) {

		this.yearOfBirth = yearOfBirth;

	}

	@Override
	public String toString() {
		return this.name;
	}
}
