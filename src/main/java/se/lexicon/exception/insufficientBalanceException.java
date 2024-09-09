package se.lexicon.exception;

public class insufficientBalanceException extends RuntimeException {
    public insufficientBalanceException(String message) {
        super(message);
    }

    public insufficientBalanceException(String message, Throwable cause) {
        super(message, cause);
    }
}
