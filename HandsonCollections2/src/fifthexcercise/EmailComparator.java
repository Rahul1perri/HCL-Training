package fifthexcercise;

import java.util.Comparator;

public class EmailComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		User u1=(User)o1;
		User u2=(User)o2;
		String e1=u1.getEmail();
		String e2=u2.getEmail();
		
		return e1.compareTo(e2);
	}		
}
