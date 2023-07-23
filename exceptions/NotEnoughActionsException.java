package exceptions;
//occurs when trying to take an action with insufficient action points left
public class NotEnoughActionsException extends GameActionException{
    public NotEnoughActionsException(String message) {
        super(message);
    }
    public NotEnoughActionsException() {
        super();
    }
}
