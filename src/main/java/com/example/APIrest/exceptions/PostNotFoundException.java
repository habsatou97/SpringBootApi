package com.example.APIrest.exceptions;

public class PostNotFoundException extends RuntimeException{
    public PostNotFoundException(Long id)
    {
        super("Could not find Post:  "+ id);
    }
}
