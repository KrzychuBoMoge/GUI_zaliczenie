package org.example.korpo;

public class NotUniqueNameException extends RuntimeException {
    public NotUniqueNameException(String error){
        super(error);
    }
}
