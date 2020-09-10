package handsonfifthexcercise;

public class Venue {
private String name;
private String city;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
void Menu() {
	System.out.println("Verify and Update Venue Details");
	System.out.println("Menu");
	System.out.println("1. Update Venue Name");
	System.out.println("2. Update City Name");
	System.out.println("3. All informations correct/Exit");	
}
}
