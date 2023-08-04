package com.doomsaj.universitymanagement.web.advice;

import com.doomsaj.universitymanagement.base.exception.NotFoundException;
import com.doomsaj.universitymanagement.base.model.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDto> onNotFoundException(NotFoundException exception) {
        var exceptionRes = ExceptionDto
                .builder()
                .message(exception.getMessage())
                .exception(exception.getClass().getSimpleName())
                .build();

        return new ResponseEntity<>(exceptionRes, HttpStatus.NOT_FOUND);
    }
}
