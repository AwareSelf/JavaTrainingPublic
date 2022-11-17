package com.nama.springboot.firstdemo.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetService {
	
	
	
	@GetMapping("greet")
	public String greetAll()
	{
		return "Hello Everyone!";
	}
	
	
	@GetMapping("greet1/{msg}")
	public String greetMsg(@PathVariable String msg)
	{
		System.out.println("msg="+msg);
		return "Hello "+msg;
	}
	
	@GetMapping("greet2")
	public String greetByName(@RequestParam String name)
	{
		System.out.println("name="+name);
		return "Hi "+name;
	}
	
	@GetMapping("greet3")
	public String greetByName(@RequestParam String name,@RequestParam String surname)
	{
		System.out.println(name+","+surname);
		return "Hi "+name+" "+surname;
	}
	
	@GetMapping("greet4/{surname}")
	public String greetByName1(@RequestParam String name,@PathVariable String surname)
	{
		System.out.println(name+","+surname);
		return "Hi "+name+" "+surname;
	}

    
}
