package seventhexcercise;

import java.util.Comparator;

public class CallLog implements Comparator {

	private String name;
	private String dialledNumber;
	private int duration;
	private String dialledDate;
	
	public CallLog() {
		
	}
	protected CallLog(String name, String dialledNumber, int duration, String dialledDate) {
		super();
		this.name = name;
		this.dialledNumber = dialledNumber;
		this.duration = duration;
		this.dialledDate = dialledDate;
	}
	
	
	public int compare(Object o1,Object o2) {
		CallLog CL1=(CallLog)o1;
		CallLog CL2=(CallLog)o2;
		if(CL1.duration < CL2.duration) {
			return 1;
		}else if(CL1.duration > CL2.duration)
		{return -1;}else
		{return 0;}
	}
	
	public String toString() {
		System.out.format("%-15s%-25s%-15s%-15s",name,"(+91"+dialledNumber+")",duration,dialledDate);
		return "" ;
	}
	
	
	
}
