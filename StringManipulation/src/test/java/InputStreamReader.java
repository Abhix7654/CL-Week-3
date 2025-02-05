import static org.junit.jupiter.api.Assertions.assertEquals;

import inputstreamreader.ConvertByteToCharacter;
import org.junit.jupiter.api.Test;

public class InputStreamReader {
    @Test
    void readFile(){
        String s="Dil tuta to awaj badi der tak suani di\nkuch iss tarh har tukde ne uski bewafi ki gawahi di\nmai sambhalata v to akhir kaise\nmuje kal mod pr wo kisi aur ke sath dikhai di";

        assertEquals(ConvertByteToCharacter.readFileUsingInputStreamReader("C:\\Users\\rajab\\Downloads\\example.txt").trim(),s);
    }

}
