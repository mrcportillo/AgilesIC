/**
 * Created by mrc on 31/05/16.
 */
import Core.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    private final String HELO_METHOD_TEST_STRING = "Hola juan";
    private final String HELO_METHOD_TEST_MARCOS_STRING = "Hola señor Marcos";
    
    @Test
    public void heloMethodTest() {
        String methodResult = Main.holaMethod("juan");
        assertEquals("no iguales", methodResult, HELO_METHOD_TEST_STRING);
    }

    @Test
    public void heloMethodMarcosTest() {
        String methodResult = Main.holaMethod("Marcos");
        assertEquals("no iguales", methodResult, HELO_METHOD_TEST_MARCOS_STRING);
    }
}
