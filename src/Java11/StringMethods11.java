package Java11;

import java.util.stream.Collectors;

public class StringMethods11 {
    public static void main(String[] args) {
        System.out.println("Mark".isBlank());
        System.out.println(" Mark ".strip());
        System.out.println(" Mark Ma".stripLeading());
        System.out.println(" Mark Ma ".stripTrailing());
        System.out.println(" Mark Ma ".repeat(2));
        System.out.println(" Mark \r Ma \n".repeat(2).lines().collect(Collectors.toList()));
    }
}
