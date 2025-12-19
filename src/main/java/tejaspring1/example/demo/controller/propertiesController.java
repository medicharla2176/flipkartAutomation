package tejaspring1.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import tejaspring1.example.demo.model.Bookmodel;
import tejaspring1.example.demo.utlity.Bookconfig;
@Data
@RestController
public class propertiesController {
	
	@Autowired 
	Bookconfig bookconfig;
@Value("${spring.application.name}")
	private String appversion;
	
@Value("${server.port}")
private Integer serverPort;
	@GetMapping("/get_config")
	public String getConfig() {
		return appversion+serverPort;
	}
	
	//another
	
	@GetMapping("/book_config") 
	
	public ResponseEntity<Bookmodel> getConid() {
		Bookmodel  book=new Bookmodel();
//		book.setName(bookconfig.getName());
//		book.setAutor(bookconfig.getAutor());
//		book.setPages(bookconfig.getPages());
		
		//System.out.println(bookconfig.getName()+"+++"+ bookconfig.getAutor()+"===="+ bookconfig.getPages());
		return new ResponseEntity<>(book, HttpStatus.valueOf(200));
	}
}
