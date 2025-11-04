package edu.io;

public class ShovelToken extends Token {
    private int durability;

    public ShovelToken(int durability){
        super("");
        this.durability = durability;
    }

    public int durability(){
        return this.durability;
    }
}
