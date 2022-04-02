package Java10;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VarKeywordDemo {
    @Test
    public void whenVarInitWithString_thenGetStringTypeVar() {
        // local variable
        // have initializer to initialize it
        // type from right hand side
        var message = "Hello, Java 10";
        assertTrue(message instanceof String);
    }
}
