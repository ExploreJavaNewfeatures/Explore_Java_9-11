package Java11;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class NewFileMethod {
    @Test
    public void should_equal_to_when_get_string_from_demo_txt() throws IOException {
        Path filePath = Files.writeString(Files.createTempFile(Path.of("./"), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        assertThat(fileContent, is("Sample text"));
    }
}
