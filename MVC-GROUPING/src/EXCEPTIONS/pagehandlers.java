package EXCEPTIONS;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class pagehandlers {

	@ExceptionHandler(value=RuntimeException.class)   
	public String exceptions()
	{
		return "error";
	}
}
