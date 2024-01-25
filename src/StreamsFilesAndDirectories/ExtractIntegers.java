package StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
             FileWriter fileWriter = new FileWriter("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt")) {

            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    char[] charArr = String.valueOf(scanner.nextInt()).toCharArray();
                    for (char ch : charArr) {
                        fileWriter.write(ch);
                    }
                    fileWriter.write(10);
                }
                scanner.next();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
