package StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

    String input = "C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
    String output = "C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output))) {

            int count = 1;
            String line = bufferedReader.readLine();

            while (line != null) {
                if (count % 3 == 0) {
                    bufferedWriter.write(line);
                    bufferedWriter.write(10);
                }
                count++;
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
