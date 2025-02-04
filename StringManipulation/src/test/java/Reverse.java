import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringbuilder.ReverseString;

import java.util.Scanner;

public class Reverse {
    @Test
    void rev(){
        String s="Abhi";

        Assertions.assertEquals(ReverseString.reverse("ihbA"),s);
    }
}
