package ninthexcercise;

import java.util.Comparator;

public class EmailComparator implements Comparator{

@Override
public int compare(Object a1, Object a2) {
	   User U1=(User)a1;
	   User U2=(User)a2;
	   if(U1.getEmail().charAt(0)<U2.getEmail().charAt(0)) {
		   return -1;
	   }else if(U1.getEmail().charAt(0)>U2.getEmail().charAt(0)) {
		   return 1;
	   }else
		   return 0;
}
}
