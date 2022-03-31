package Java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ExploreTryWithResource {
    public static void main(String[] args) throws IOException {
        System.out.println(readDataBeforeJava9("testBeforeJava9"));
        System.out.println(readDataJava9("testJava9"));
    }

    static String readDataBeforeJava9(String message) throws IOException {
        Reader inputString = new StringReader(message);
        try (BufferedReader br1 = new BufferedReader(inputString)) {
            return br1.readLine();
        }
    }

    static String readDataJava9(String message) throws IOException {
        Reader inputString = new StringReader(message);
        BufferedReader br1 = new BufferedReader(inputString);
        try (br1) {
            return br1.readLine();
        }
    }
}
