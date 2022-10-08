package hrmsapp.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class EmployeeNotFoundException extends Exception {
	String message;
}
