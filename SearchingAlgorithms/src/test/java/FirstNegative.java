import static org.junit.jupiter.api.Assertions.assertEquals;

import linearsearch.FirstNegativeNumber;
import org.junit.jupiter.api.Test;

public class FirstNegative {
    @Test
    void finfnegative(){
        int arr[] = {2, 5, 3, -4, 7, -2, 6};
        int index=3;
       assertEquals(FirstNegativeNumber.findNegative(arr),index);
    }

}
