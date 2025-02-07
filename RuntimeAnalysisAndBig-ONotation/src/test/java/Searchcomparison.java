
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import searchtargetinlargedataset.SearchComparison;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Searchcomparison {
    @Test
    void linearVsBinary(){
        int arr[]={1000,10000,100000};
        for (int size:arr){
            double ans[] =SearchComparison.compare(size);
            assertTrue(ans[0]>ans[1]);
        }

    }

}
