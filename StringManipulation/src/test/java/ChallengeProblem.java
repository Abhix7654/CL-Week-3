import challengeproblem.StringBuilderVsStringBuffer;
import org.junit.jupiter.api.Test;
import stringbuffer.Compare;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChallengeProblem {
    @Test
    void stringBuilderStringBuffer(){
        Long arr[]= StringBuilderVsStringBuffer.stringBuilderVsStringBuffer("Abhishek");
        assertTrue(arr[0] > arr[1]);

    }
}
