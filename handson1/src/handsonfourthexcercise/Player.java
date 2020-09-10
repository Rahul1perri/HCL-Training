package handsonfourthexcercise;

public class Player {
	String name;
	String country;
	String skill;
	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	void Display() {
	 System.out.println("Player Name: "+ name);
     System.out.println("Country Name: "+ country);
     System.out.println("Skill: "+ skill);
	}
}
