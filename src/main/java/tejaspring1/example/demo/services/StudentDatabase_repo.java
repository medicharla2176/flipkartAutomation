package tejaspring1.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import tejaspring1.example.demo.entities.database;
import tejaspring1.example.demo.reposistory.StudentRepo;

@Service
public class StudentDatabase_repo {
@Autowired
StudentRepo studentRepo;

@PostConstruct
void saveStudendetails() {
	database data=new database();
	data.setStudentName("sai teja");
	data.setAddress("malikipuram");
	studentRepo.save(data);
	}

}
