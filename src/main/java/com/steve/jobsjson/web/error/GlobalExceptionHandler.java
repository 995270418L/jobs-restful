package com.steve.jobsjson.web.error;

import com.steve.jobsjson.util.Response;
import com.steve.jobsjson.util.exceptions.DataValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({DataValidationException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Response handlerDataValidationException(DataValidationException e){
        return Response.error(e.getMessage());
    }

}
