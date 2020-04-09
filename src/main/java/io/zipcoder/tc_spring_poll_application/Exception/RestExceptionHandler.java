package io.zipcoder.tc_spring_poll_application.Exception;

import io.zipcoder.tc_spring_poll_application.Error.ErrorDetail;
import io.zipcoder.tc_spring_poll_application.Exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe, HttpServletRequest request) {
        ErrorDetail errorDetail = new ErrorDetail("Resource not found!",404,"Resource id does not exist!",new Date().getTime(),"Id must be made!");

       return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }
}