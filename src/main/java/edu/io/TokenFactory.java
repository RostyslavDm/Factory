package edu.io;

public class TokenFactory {
    private static EmptyToken emptyToken;
    public static EmptyToken createEmptyToken(){
        if(emptyToken == null){
            return new EmptyToken();
        }
        return emptyToken;
    }
    public static GoldToken createGoldToken(){
        return new GoldToken(2);
    }

    public static GoldToken createGoldToken(int amount){
        return new GoldToken(amount);
    }

    public static FoodToken createFoodToken(){
        return new FoodToken(4);
    }

    public static FoodToken creaFoodToken(int amount){
        return new FoodToken(amount);
    }

    public static ShovelToken createShovelToken(){
        return new ShovelToken(3);
    }

    public static ShovelToken creaShovelToken(int durability){
        return new ShovelToken(durability);
    }
}
