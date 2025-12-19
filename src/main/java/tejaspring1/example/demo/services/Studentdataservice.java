package tejaspring1.example.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tejaspring1.example.demo.entities.database;
import tejaspring1.example.demo.model.InputStudent;
import tejaspring1.example.demo.model.OutputStudent;
import tejaspring1.example.demo.reposistory.StudentRepo;

@Service
public class Studentdataservice {
    private static final Logger log = LoggerFactory.getLogger(Studentdataservice.class);
@Autowired
StudentRepo studentRepo;
    public OutputStudent savestudentdetails(InputStudent inputstd){
       String stdname= inputstd.getStdname();
        String stdaddress=inputstd.getStdaddress();
        log.info("Studentname is :", stdname);
        database data=new database();
        data.setStudentName(stdname);
        data.setAddress(stdaddress);
        database dataa= studentRepo.save(data);

        OutputStudent outputdata=new OutputStudent();
        outputdata.setSid(dataa.getStudentId());
        outputdata.setSname(dataa.getStudentName());
        outputdata.setSaddress(dataa.getAddress());
        return outputdata;
    }

}
