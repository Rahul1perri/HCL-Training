package fifthexcercise;
import java.util.Comparator;

public class NameComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		User u1=(User)o1;
		User u2=(User)o2;
		String e1=u1.getName();
		String e2=u2.getName();
		
		return e1.compareTo(e2);
	}	
	
	
	
	
	
	
	
}
