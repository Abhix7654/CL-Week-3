package stringbuffer;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String str[]={"Abhishek"," is"," Good"," Boy"};

        System.out.println(concatenateString(str));

    }
    public static String concatenateString(String []str){
        StringBuffer sb=new StringBuffer();

        for(String i:str){
            sb.append(i);
        }


        return sb.toString();
    }
}
