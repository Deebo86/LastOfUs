package exceptions;

//occurs when trying to target wrong character with an action
public class InvalidTargetException extends GameActionException{
    public InvalidTargetException(String message) {
        super(message);
    }
    public InvalidTargetException() {
        super();
    }
}
