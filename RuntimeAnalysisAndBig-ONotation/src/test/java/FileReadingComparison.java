import largefilereadingefficiency.LargeFileReadingEfficiency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStreamReader;

public class FileReadingComparison {
    @Test
    void fileReaderVsInputStream(){
        int arr[]= LargeFileReadingEfficiency.compare();
//        arr[0]=FileReader Time;
//        arr[1]= InputStreamReader Time;
        Assertions.assertTrue(arr[0]>arr[1]);
    }
}
