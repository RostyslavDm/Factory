package edu.io;

public class FoodToken extends Token {
    private int amount;
    public FoodToken(int amount){
        super("F");
        this.amount = amount;
    }

    public int amount(){
        return this.amount;
    }
}
