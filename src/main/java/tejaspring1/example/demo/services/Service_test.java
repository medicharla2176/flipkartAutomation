package tejaspring1.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import tejaspring1.example.demo.model.model;

@Service 
public class Service_test {
	List<model> list=new ArrayList<>();
 @PostConstruct
	public void stidetsdata() {
	list.add(new model("sai", 10));
	list.add(new model("sahdi", 100));
	}
 public List<model> getalldetails() {
	 return list;
 }
 //update details
 public model updatestudent(model m) {
 //Integer mm=m.getUser_age();
 for(model listvalue:list) {
if(listvalue.getUser_age()==m.getUser_age()) {	 
	listvalue.setUser_name(m.getUser_name());
	 return listvalue;
}
 }
 return null;
 }
 
 public model getstudent(Integer sid) {
	 for(model m:list) {
		 if(m.getUser_age()==sid) {
			 return m;
		 }
	 }
	 return null;
 }
 
 //delete user
 
 public model deleteuser(Integer sid) {
	model m= deleteduser(sid);
	 list.remove(m);
	 return m;
 }
 private model deleteduser(int sid) {
	for(model m:list) {
		if(m.getUser_age()==sid) {
			return m;
		}
	}
	return null;
 }
}
