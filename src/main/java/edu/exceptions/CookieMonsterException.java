package edu.exceptions;

public class CookieMonsterException extends Exception{//this is checked exception
    public CookieMonsterException(String message, int cookiesCount){
        super(message + ". You cannot divide " + cookiesCount + " cookies evenly amount 0 friends!");
    }
}
