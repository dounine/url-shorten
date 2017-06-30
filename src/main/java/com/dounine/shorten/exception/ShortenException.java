package com.dounine.shorten.exception;

/**
 * Created by lake on 17-4-24.
 */
public class ShortenException extends Exception {

    public ShortenException(String msg){
        super(msg);
    }

    public ShortenException(String msg, Throwable throwable){
        super(msg,throwable);
    }

}
