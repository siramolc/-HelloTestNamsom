import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class hello_name_test {
    // f(name) = "Hello namsom"
    @Test
    @DisplayName("ทำการทดสอบ...")
    public void case01() {
        // Arrange
        hello_name hello = new hello_name  ();
        String name = "namsom";
        // Act
        String actualResult = hello_name.sawadee(name);
        // Assert
        assertEquals("Hello namsom", actualResult);
    }
}
