package fourthhandson;
import java.util.ArrayList;
public class CourseList {
private  ArrayList<Course>courseList=new ArrayList();


public  void insert(Course course) {
	courseList.add(course);
}

public void revenue(){
	double individual=0;
	double individualtotal=0;
	double finaltotal=0;
	for(Course course:courseList) {
		individual=200*0.2*course.getFee();
		individualtotal+=individual+course.getFee();
		finaltotal+=individualtotal;
	}
	System.out.println(finaltotal);
	
}

}
