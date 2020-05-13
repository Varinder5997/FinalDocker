package com.mindtree.DockerProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@Controller
public class App 
{
	 @GetMapping("/")
	    public String index(Model model) {
	        return "NewFile";
	    }

	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
