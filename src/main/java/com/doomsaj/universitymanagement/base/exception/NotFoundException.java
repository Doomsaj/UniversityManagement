package com.doomsaj.universitymanagement.base.exception;

public class NotFoundException extends Exception{
    public NotFoundException() {
        super("requested resource was not found");
    }
}
