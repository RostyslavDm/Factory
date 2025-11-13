package edu.io;

public class EmptyToken extends Token {
    private static final EmptyToken instance = new EmptyToken(); 
    public EmptyToken(){
        super("・");
    }

    public static EmptyToken getInstance(){
        return instance;
    }
}
