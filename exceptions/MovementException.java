package exceptions;
//occurs when trying to make invalid movement
public class MovementException extends GameActionException {
    public MovementException(String message) {
        super(message);
    }
    public MovementException() {
        super();
    }
}
