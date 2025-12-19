package tejaspring1.example.demo.utlity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Max;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Validated
@Configuration
@ConfigurationProperties(prefix = "book")
@Data
//@Setter
//@Getter
public class Bookconfig {
	public String name;
	public String autor;
	@Max(value=200, message="Pages count should not be more than 200")
	public Integer pages;
	
	
}

