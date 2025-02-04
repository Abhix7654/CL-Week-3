import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import stringbuilder.RemoveDuplicates;
import stringbuilder.ReverseString;

public class StringBuilder {
    @Test
    void rev(){
        String s="Abhi";

        assertEquals(ReverseString.reverse("ihbA"),s);
    }
    @Test
    void dupl(){
        String s="asdfghjkl";

        assertEquals(RemoveDuplicates.removeDuplicate("asdfghjklkkjsjgdfdadsdsghddjdk"),s);

    }
}
