import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import stringbuffer.ConcatenateStrings;

public class StringBuffer {
    @Test
    void concate(){
        String s="Abhishek is Good Boy";
        String str[]={"Abhishek"," is"," Good"," Boy"};

      assertEquals(ConcatenateStrings.concatenateString(str),s);
    }

}
