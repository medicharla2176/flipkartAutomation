package tejaspring1.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tejaspring1.example.demo.model.InputStudent;
import tejaspring1.example.demo.model.OutputStudent;
import tejaspring1.example.demo.services.Studentdataservice;

@RestController
@RequestMapping("/student-data")
public class Studentdatabasesave {
    @Autowired
    Studentdataservice studentdataservice;
    @PostMapping ("/student-data")
        public ResponseEntity<OutputStudent> savestudentdata(@RequestBody InputStudent inputstd){

        OutputStudent outputStudent=studentdataservice.savestudentdetails(inputstd);
        return new ResponseEntity<>(outputStudent, HttpStatusCode.valueOf(201));
        }
}
