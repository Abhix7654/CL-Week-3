package inputstreamreader;

import java.io.*;

public class ConvertByteToCharacter {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rajab\\Downloads\\example.txt";

        readFileUsingInputStreamReader(filePath);
    }

    public static String readFileUsingInputStreamReader(String filePath) {
        StringBuilder sb=new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);

            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append("\n");
            }

            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        return sb.toString();
    }
}

