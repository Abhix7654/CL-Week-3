package linearsearch;

public class SpecificWordInList {
    public static void main(String[] args) {
        String arr[]={"Iam Abhishek","iam good boy.","I live in Piplani"};
        String target="good";
        System.out.println(findWord(arr,target));

    }
    public static String findWord(String arr[],String target){

        for(int i=0;i<arr.length;i++){
            String word[]=arr[i].split("\\s+");

            for(int j=0;j<word.length;j++){
                if(target.equals(word[j])){
                     return arr[i];
                }
            }
        }



        return "Not Found";
    }
}
