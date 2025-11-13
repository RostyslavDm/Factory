import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import edu.io.EmptyToken;
import edu.io.FoodToken;
import edu.io.GoldToken;
import edu.io.ShovelToken;
import edu.io.Token;
import edu.io.TokenFactoryAlt;
import edu.io.TokenFactoryAlt.TokenType;

public class Test_FactoryMethod_5 {

    @Test
    void factoryAlt_can_create_token_by_type() {
        Token goldToken = TokenFactoryAlt.createToken(TokenType.GOLD);
        Assertions.assertInstanceOf(GoldToken.class, goldToken);

        Token foodToken = TokenFactoryAlt.createToken(TokenType.FOOD);
        Assertions.assertInstanceOf(FoodToken.class, foodToken);

        Token shovelToken = TokenFactoryAlt.createToken(TokenType.SHOVEL);
        Assertions.assertInstanceOf(ShovelToken.class, shovelToken);

        Token emptyToken = TokenFactoryAlt.createToken(TokenType.EMPTY);
        Assertions.assertSame(emptyToken, EmptyToken.getInstance());
    }

    @Test
    void factoryAlt_creates_random_value_gold_token() {
        Token goldToken = TokenFactoryAlt.createToken(TokenType.GOLD);
        Assertions.assertInstanceOf(GoldToken.class, goldToken);
        int amount = ((GoldToken) goldToken).amount();
        Assertions.assertTrue(amount >= 1 && amount <= 100);
    }

    @Test
    void factoryAlt_creates_random_value_food_token() {
        Token foodToken = TokenFactoryAlt.createToken(TokenType.FOOD);
        Assertions.assertInstanceOf(FoodToken.class, foodToken);
        int amount = ((FoodToken) foodToken).amount();
        Assertions.assertTrue(amount >= 1 && amount <= 100);
    }

    @Test
    void factoryAlt_creates_random_durability_shovel_token() {
        Token shovelToken = TokenFactoryAlt.createToken(TokenType.SHOVEL);
        Assertions.assertInstanceOf(ShovelToken.class, shovelToken);
        int durability = ((ShovelToken) shovelToken).durability();
        Assertions.assertTrue(durability >= 1 && durability <= 100);
    }

    @Test
    void factoryAlt_creates_single_GoldToken_for_each_amount() {
        Token t1 = TokenFactoryAlt.createToken(TokenType.GOLD, 30);
        Token t2 = TokenFactoryAlt.createToken(TokenType.GOLD, 30);
        Token t3 = TokenFactoryAlt.createToken(TokenType.GOLD, 50);

        Assertions.assertSame(t1, t2);
        Assertions.assertNotSame(t1, t3);
    }

    @Test
    void factoryAlt_creates_single_FoodToken_for_each_amount() {
        Token t1 = TokenFactoryAlt.createToken(TokenType.FOOD, 40);
        Token t2 = TokenFactoryAlt.createToken(TokenType.FOOD, 40);
        Token t3 = TokenFactoryAlt.createToken(TokenType.FOOD, 60);

        Assertions.assertSame(t1, t2);
        Assertions.assertNotSame(t1, t3);
    }
}
