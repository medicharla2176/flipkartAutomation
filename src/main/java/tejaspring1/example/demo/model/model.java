package tejaspring1.example.demo.model;

public class model {
private String user_name;
private int user_age;

public model() {
    // Default constructor (REQUIRED for JSON mapping)
}
public model (String user_name, int user_age){
	this.user_name=user_name;
	this.user_age=user_age;
	
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public int getUser_age() {
	return user_age;
}
public void setUser_age(int user_age) {
	this.user_age = user_age;
}
}
