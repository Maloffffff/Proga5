package exception;

public class InvalidFieldException extends Exception{
    /**
     * Constructor
     * @param message
     */
    public InvalidFieldException(String message) {
        super(message);
    }
}

