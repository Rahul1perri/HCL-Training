package handson2;

public class StageEvent extends Event {

	private int noOfShows;
	private int noOfSeatsPerShow;
	protected int getNoOfShows() {
		return noOfShows;
	}
	protected void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}
	protected int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}
	protected void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	
	public double projectedRevenue() {
		double r=noOfShows*noOfSeatsPerShow*50;
		return r;
	}
	
	
}
