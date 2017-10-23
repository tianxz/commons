package org.vinci.commons.core.exception;

/**
 * Created by XizeTian on 2017/10/20.
 */
public class VinciException extends RuntimeException {
    public VinciException() {
    }

    public VinciException(String message) {
        super(message);
    }

    public VinciException(String message, Throwable cause) {
        super(message, cause);
    }

    public VinciException(Throwable cause) {
        super(cause);
    }

    public VinciException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
