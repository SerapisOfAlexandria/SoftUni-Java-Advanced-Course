package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) {

        Path pathInp = Paths.get("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path pathOutp = Paths.get("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(pathInp)));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(pathOutp)))) {

            List<String> text = Files.readAllLines(pathInp);
            Collections.sort(text);

            for (String i : text) {
                bufferedWriter.write(i);
                bufferedWriter.write(10);
            }


        } catch (IOException e) {

        }
    }
}


