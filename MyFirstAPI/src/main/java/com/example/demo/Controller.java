package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Controller {
@GetMapping("Arif")
public String test() {
	
	return "Arif - Welcome to Agile Scrum Team";
	
}



@GetMapping("Arya")
public String test2() {
	
	return "Arya - Welcome to Agile Scrum Team";
	
}

@RequestMapping("/sample")
public SampleResponse Sample(@RequestParam(value = "name",
defaultValue = "Robot") String name ,@RequestParam(value = "id_num",
defaultValue = "3") long id_num ) {
	SampleResponse response = new SampleResponse();
	response.setId(id_num);
	response.setMessage("Your name is "+name);
	return response;

}


}
