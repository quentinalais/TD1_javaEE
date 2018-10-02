package application;

public class Student {



int id;
String name;
String gender;
String date;
String photo;
String mark;
String comments;


public Student(int id, String name, String gender, String date, String photo, String mark, String comments) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.date = date;
	this.photo = photo;
	this.mark = mark;
	this.comments = comments;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getMark() {
	return mark;
}
public void setMark(String mark) {
	this.mark = mark;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}



public Student(String name, String gender) {
	
	this.name = name;
	this.gender = gender;
}



	
	

}
