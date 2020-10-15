package thirdhandson;
import java.util.ArrayList;
public class CourseList {
private  ArrayList<Course>courseList=new ArrayList();


public  void insert(Course course) {
	courseList.add(course);
}

public void discount(){
	double highest=0;
	double least=99999;
	String highestname=null;String leastname=null;
	for(Course course:courseList) {
		if(course.getFee()>highest) {
			highest=course.getFee();
			highestname=course.getName();
			}
		else if(course.getFee()<least) {
			least=course.getFee();
			leastname=course.getName();
		}
	}
	System.out.println("The discount price for "+highestname+" is: "+0.1*highest);
	System.out.println("The discount price for "+leastname+" is: "+0.05*least);
}



}
