
import com.prueba.controller.TextProcesation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TextProcessorTest {

    private TextProcesation textProcesation;

    @BeforeEach
    public void setUp() {
        textProcesation = new TextProcesation();
    }

    @Test
    public void testProcessText_ValidInput() {
        textProcesation.setInputText("3\\the force is strong in this one");
        textProcesation.processText();
        assertEquals("the force is strong in this one\\false", textProcesation.getOutputText());

        textProcesation.setInputText("7\\take what you can, give nothing back");
        textProcesation.processText();
        assertEquals("take what you can give nothing back\\true", textProcesation.getOutputText());

        textProcesation.setInputText("5\\Here’s looking at you, kid.");
        textProcesation.processText();
        assertEquals("heres looking at you kid\\true", textProcesation.getOutputText());

        textProcesation.setInputText("10\\Father to murderen son, husband to a murdered wife. And I will have my vengeance, in this life or the next");
        textProcesation.processText();
        assertEquals("father to murderen son husband to a murdered wife and i will have my vengeance in this life or the next\\false", textProcesation.getOutputText());

        textProcesation.setInputText("15\\’Here’s Johnny!’");
        textProcesation.processText();
        assertEquals("heres johnny\\false", textProcesation.getOutputText());
    }

    @Test
    public void testProcessText_InvalidFormat() {
        textProcesation.setInputText("3the force is strong in this one");

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> textProcesation.processText()
        );
        

        assertEquals("La frase no tiene el Formato Invalido", thrown.getMessage());

    }

}
