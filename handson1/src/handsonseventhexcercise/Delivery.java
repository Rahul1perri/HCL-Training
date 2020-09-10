package handsonseventhexcercise;

public class Delivery {
private long over;
private long ball;
private long runs;
private String batsman;
private String bowler;
private String nonStriker;
public long getOver() {
	return over;
}
public void setOver(long over) {
	this.over = over;
}
public long getBall() {
	return ball;
}
public void setBall(long ball) {
	this.ball = ball;
}
public long getRuns() {
	return runs;
}
public void setRuns(long runs) {
	this.runs = runs;
}
public String getBatsman() {
	return batsman;
}
public void setBatsman(String batsman) {
	this.batsman = batsman;
}
public String getBowler() {
	return bowler;
}
public void setBowler(String bowler) {
	this.bowler = bowler;
}
public String getNonStriker() {
	return nonStriker;
}
public void setNonStriker(String nonStriker) {
	this.nonStriker = nonStriker;
}
public Delivery(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
	super();
	this.over = over;
	this.ball = ball;
	this.runs = runs;
	this.batsman = batsman;
	this.bowler = bowler;
	this.nonStriker = nonStriker;
}
void displayDeliveryDetails() {
	System.out.println("Delivary Details:");
	System.out.println("over:"+" "+over);
	System.out.println("Ball:"+" "+ ball);
	System.out.println("Runs:"+" "+ runs);
	System.out.println("Batsman:"+ " "+ batsman);
	System.out.println("Bowler:"+" "+ bowler);
	System.out.println("NonStriker:"+" "+ nonStriker);
}


}
