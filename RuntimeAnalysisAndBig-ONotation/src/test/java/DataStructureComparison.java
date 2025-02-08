import comparingdifferentdatastructures.ComparingDataStructures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataStructureComparison {
    @Test
    void arrayVsHashSetVsHashTree(){
        double ans[]= ComparingDataStructures.compare();
//        arr[0]=Time of Array
//        arr[1]=Time of HashSet
//        arr[2]=Time of TreeSet
//

        Assertions.assertTrue(ans[0]>ans[1] && ans[1]<ans[2]);
    }
}
