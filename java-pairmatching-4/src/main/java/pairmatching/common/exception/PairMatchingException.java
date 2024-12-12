package pairmatching.common.exception;

public class PairMatchingException extends IllegalArgumentException{
    private static final String PREFIX = "[ERROR] ";
    private final String errorMessage;

    public PairMatchingException(String message){
        super(PREFIX + message);
        this.errorMessage = PREFIX + message;
    }

}
