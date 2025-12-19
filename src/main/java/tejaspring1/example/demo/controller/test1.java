package tejaspring1.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tejaspring1.example.demo.model.model;
import tejaspring1.example.demo.services.Service_test;

@RestController
public class test1 {
	private final Service_test service_test;

	test1(Service_test ss) {
		service_test = ss;
	}

	@GetMapping("/studentget")
	public ResponseEntity<List<model>> getstudents() {
		List<model> getstudent = service_test.getalldetails();
		return new ResponseEntity<>(getstudent, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/deleteuser/{sid}")
	public ResponseEntity<model> deleteuser1(@PathVariable("sid") Integer sid) {
		model m = service_test.deleteuser(sid);
		return new ResponseEntity<>(m, HttpStatus.valueOf(200));
	}

	@PutMapping("/update_details")
	public ResponseEntity<?>  updatedetails(@RequestBody model m) {
		model updated=service_test.updatestudent(m);

	    if(updated == null) {
	        return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
	    }

	    return new ResponseEntity<>(updated,  HttpStatus.OK);	    
	}
	@GetMapping("/get_singlestudent")
	public ResponseEntity<model> getsinglestudent(@RequestParam Integer sid) {
		model m=service_test.getstudent(sid);
		return new ResponseEntity<>(m, HttpStatusCode.valueOf(200));
		//http://localhost:8081/get_singlestudent?sid=10
	}
	
	}

