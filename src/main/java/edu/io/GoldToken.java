package edu.io;

public class GoldToken extends Token{
    private int amount;

    public GoldToken(int amount){
        super("");
        this.amount = amount;
    }
    
    public GoldToken(String label, int amount){
        super(label);
        this.amount = amount;
    }

    public int amount(){
        return this.amount;
    }

}
