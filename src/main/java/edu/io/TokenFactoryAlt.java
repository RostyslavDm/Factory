package edu.io;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TokenFactoryAlt {
    private static final Map<Integer, GoldToken> gold = new HashMap<>();
    private static final Map<Integer, FoodToken> food = new HashMap<>();
    private static Random random = new Random();
    public enum TokenType{
        EMPTY,
        GOLD,
        FOOD,
        SHOVEL
    }

    public static EmptyToken createEmptyToken(){
        return EmptyToken.getInstance();
    }

    public static GoldToken createGoldToken(int amount){
        if(!gold.containsKey(amount)) gold.put(amount, new GoldToken(amount));
        return gold.get(amount);
    }

    public static FoodToken createFoodToken(int amount){
        if(!food.containsKey(amount)) food.put(amount, new FoodToken(amount));
        return food.get(amount);
    }

    public static ShovelToken createShovelToken(int durability){
        return new ShovelToken(durability);
    }

    public static Token createToken(TokenType type, int amount){
        switch (type) {
            case GOLD:
                return createGoldToken(amount);
            case FOOD:
                return createFoodToken(amount);
            case SHOVEL:
                return createShovelToken(amount);
            case EMPTY:
                return createEmptyToken();
            default:
                throw new IllegalArgumentException("");
        }
    }

    public static Token createToken(TokenType type){
        return createToken(type, randomAmount());
    }

    public static int randomAmount(){
        return random.nextInt(100)+1;
    }
}
