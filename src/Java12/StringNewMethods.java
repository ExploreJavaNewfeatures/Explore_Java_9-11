package Java12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringNewMethods {
    @Test
    public void givenString_Indent() {
        String text = "Baeldung";
        text = text.indent(4);
        assertEquals("    Baeldung\n", text);
    }
    @Test
    public void givenString_thenRevertValue() {
        String text = "Baeldung";
        String transformed = text.transform(value ->
                new StringBuilder(value).reverse().toString()
        );

        assertEquals("gnudleaB", transformed);
    }
}
