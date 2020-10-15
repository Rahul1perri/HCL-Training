package com.hcl;
import java.util.ArrayList;
public class CourseList {
private  ArrayList<Course>courseList=new ArrayList();


public  void insert(Course course) {
	courseList.add(course);
}



public  ArrayList<String> noOfCourse(Double budget) {
ArrayList<String> noofobjects=new ArrayList();

for(Course course:courseList) {
if(budget>=course.getFee()) {
	int f=(int)(budget/course.getFee());
	String validatingsentence=course.getName()+"-"+f;
	noofobjects.add(validatingsentence);
}}
	return noofobjects;
	
}

}
