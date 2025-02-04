package filereader;

import java.io.*;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rajab\\Downloads\\example.txt";
        String fileContent = readFile(filePath);

        System.out.println(fileContent);

         }

    public static String readFile(String filePath) {
        String s="";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                s+=line+"\n";
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        return s;

    }
}

