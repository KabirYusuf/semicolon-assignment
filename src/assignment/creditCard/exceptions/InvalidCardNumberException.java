package assignment.creditCard.exceptions;

public class InvalidCardNumberException extends RuntimeException{
    public InvalidCardNumberException(String message){
        super(message);
    }
}
