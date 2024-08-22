package com.ra.project_module5_reactjs.exception;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public class CustomException extends Exception {
    private final HttpStatus status;

    public CustomException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
