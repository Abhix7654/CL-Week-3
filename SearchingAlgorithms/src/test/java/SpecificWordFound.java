import linearsearch.SpecificWordInList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpecificWordFound {
    @Test
    void wordFound(){
        String arr[]={"Iam Abhishek","iam good boy.","I live in Piplani"};
        String target="good";

        Assertions.assertEquals(SpecificWordInList.findWord(arr,target),arr[1]);
    }
}
