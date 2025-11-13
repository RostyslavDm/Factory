package edu.io;

import java.util.HashMap;
import java.util.Map;

public class TokenFactory {
    private static final Map<Integer, GoldToken> gold = new HashMap<>();
    private static final Map<Integer, FoodToken> food = new HashMap<>();
    
    public static EmptyToken createEmptyToken(){
        return EmptyToken.getInstance();
    }
    public static GoldToken createGoldToken(){
        return createGoldToken(2);
    }

    public static GoldToken createGoldToken(int amount){
        if(!gold.containsKey(amount)) gold.put(amount, new GoldToken(amount));
        return gold.get(amount);
    }

    public static FoodToken createFoodToken(){
        return createFoodToken(4);
    }

    public static FoodToken createFoodToken(int amount){
        if(!food.containsKey(amount)) food.put(amount, new FoodToken(amount));
        return food.get(amount);
    }

    public static ShovelToken createShovelToken(){
        return createShovelToken(3);
    }

    public static ShovelToken createShovelToken(int durability){
        return new ShovelToken(durability);
    }
}
