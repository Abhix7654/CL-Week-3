import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuffer.Compare;
import stringbuffer.ConcatenateStrings;

public class StringBuffer {
    @Test
    void concate(){
        String s="Abhishek is Good Boy";
        String str[]={"Abhishek"," is"," Good"," Boy"};

      assertEquals(ConcatenateStrings.concatenateString(str),s);
    }
    @Test
    void compare(){
        Long arr[]= Compare.comparing("Abhishek");
        assertTrue(arr[0] > arr[1]);
    }

}
