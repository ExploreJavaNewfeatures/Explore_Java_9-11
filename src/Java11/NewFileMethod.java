package Java11;

import org.junit.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



public class NewFileMethod {
    public static void main(String[] args) throws IOException {
        Path filePath = Files.writeString(Files.createTempFile(Path.of("./"), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);
    }
}
