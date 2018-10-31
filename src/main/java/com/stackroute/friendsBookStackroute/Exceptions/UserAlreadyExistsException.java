package com.stackroute.friendsBookStackroute.Exceptions;

public class UserAlreadyExistsException extends Throwable {
    String userAlreadyExistsErrorMessage="";
    public UserAlreadyExistsException(String userAlreadyExistsErrorMessage){
        this.userAlreadyExistsErrorMessage=userAlreadyExistsErrorMessage;

    }
    public String getMessage(){
        return userAlreadyExistsErrorMessage;
    }

}