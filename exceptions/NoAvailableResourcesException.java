package exceptions;
//occurs when trying to use a collectible he doesnt have
public class NoAvailableResourcesException extends GameActionException{
    public NoAvailableResourcesException(String message) {
        super(message);
    }
    public NoAvailableResourcesException() {
        super();
    }
}
