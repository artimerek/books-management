package pl.artimerek.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookRestExceptionHandler{

    @ExceptionHandler
    public ResponseEntity<BookErrorResponse> handleException(BookNotFoundException bookNotFoundException){

        BookErrorResponse bookErrorResponse =
                new BookErrorResponse(HttpStatus.NOT_FOUND.value(),
                bookNotFoundException.getMessage(),
                        System.currentTimeMillis());

        return new ResponseEntity<>(bookErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<BookErrorResponse> handleException(Exception exception){

        BookErrorResponse errorResponse =
                new BookErrorResponse(HttpStatus.BAD_REQUEST.value(),
                        exception.getMessage(),
                        System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
