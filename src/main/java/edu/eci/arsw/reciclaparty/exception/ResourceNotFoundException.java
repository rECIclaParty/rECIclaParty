package edu.eci.arsw.reciclaparty.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;
    public static final String USER_NOT_FOUND = "User not found for this id :: ";
    public static final String EMPLOYEE_NOT_FOUND = "Employee not found for this id :: ";
    public ResourceNotFoundException(String message){
        super(message);
    }
}
