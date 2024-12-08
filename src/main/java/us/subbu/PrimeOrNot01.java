package us.subbu;

import org.springframework.web.bind.annotation.RequestMapping;



import java.io.Console;
import java.io.Serializable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.logging.*;
import org.springframework.http.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class PrimeOrNot01 {
	
	private static final Logger logger = LoggerFactory.getLogger(PrimeOrNot01.class);
	   
	/* 
	@RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String welcome()
	{
		System.out.println("<html>\n" + "<body>\n" + "Hello World!\n" + "</body>\n" + "</html>\n");
		return "<html>\n" + "<body>\n" + "Hello World!\n" + "</body>\n" + "</html>\n";	
	} 
	*/
	
	/* -- @RequestMapping("/determineprime/{number}")
	public String determineprime()
	{
		return "this is the place holder for taking a number and returning whether the number is prime or not";
	} */
	
	@GetMapping("/determineprime")
	public String determineprime(@RequestParam(defaultValue = "7") long number) {
		System.out.println("got the request ..");
		PNumbers01 n1 = new PNumbers01();
		n1.setBlah(number);
		System.out.println(n1.getBlah());
		String s1 = new String();
		s1 = "number to check for prime is: " + n1.getBlah();
		logger.info(s1); 
		String result = new String();
		result = n1.getResult();
		System.out.println(result);
		s1 = "We are about to return (in next line of code) " + result;
		logger.info(s1);
		return result;
	}
	
	@GetMapping("/sayhello")
	public String SayHello() {
		return "Hi!";
	}

}
