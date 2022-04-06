package Java10;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

/*
    "var" is not actually Java keyword, in fact, it can be used as variable name.
    When declare a variable, "var" can infer to the variable's type. "var" does
    not change any existing process of Java compilation.
    Some properties:
    1. "var" can only declare variables inside method, it cannot declare class
    variables(static or non-static).
    2. variables declared by "var" must be initialised with a value.
    3. "var" can only be used to define one variable each time.
*/

public class VarKeywordDemo {
    @Test
    public void whenVarInitWithString_thenGetStringTypeVar() {
        // local variable
        // have initializer to initialize it
        // type from right hand side
        int x = 10;
        var message = "Hello, Java 10";
        assertTrue(message instanceof String);
    }
}
