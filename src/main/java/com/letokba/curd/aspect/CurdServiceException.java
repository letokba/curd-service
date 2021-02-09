package com.letokba.curd.aspect;

/**
 * @author Yong
 * @date 2021/2/9
 */
public class CurdServiceException extends RuntimeException{

    public CurdServiceException() {
    }

    public CurdServiceException(String message) {
        super(message);
    }

    public CurdServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public CurdServiceException(Throwable cause) {
        super(cause);
    }
}
