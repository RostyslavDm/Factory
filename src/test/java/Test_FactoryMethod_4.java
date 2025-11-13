import edu.io.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Test_FactoryMethod_4 {

    @Test
    void factory_create_single_EmptyToken_instance(){
        var t1 = TokenFactory.createEmptyToken();
        var t2 = TokenFactory.createEmptyToken();
        Assertions.assertSame(t1, t2);
    }

    @Test
    void factory_create_single_GoldToken_for_each_amount(){
        var t1 = TokenFactory.createGoldToken(10);
        var t2 = TokenFactory.createGoldToken(10);
        var t3 = TokenFactory.createGoldToken(20);
        Assertions.assertSame(t1, t2);
        Assertions.assertNotSame(t2, t3);
    }

    @Test
    void factory_create_single_FoodToken_for_each_amount(){
        var t1 = TokenFactory.createFoodToken(10);
        var t2 = TokenFactory.createFoodToken(10);
        var t3 = TokenFactory.createFoodToken(20);
        Assertions.assertSame(t1, t2);
        Assertions.assertNotSame(t2, t3);
    }

    @Test
    void factory_create_unique_ShovelToken_instance(){
        var t1 = TokenFactory.createShovelToken(5);
        var t2 = TokenFactory.createShovelToken(5);
        Assertions.assertNotSame(t1, t2);
    }
}
