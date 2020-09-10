package handsonthirdexcercise;

public class Delivery {
long over;
long ball;
long runs;
String batsman;
String bowler;
String nonStriker;

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
