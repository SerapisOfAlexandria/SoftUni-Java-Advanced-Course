package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFiles {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        File directory = new File(path.toUri());

        File[] files = directory.listFiles();

        for (File file : files) {
            if (files != null) {
                if (file.isFile()) {
                    System.out.printf("%s: [%d]\n", file.getName(), file.length());
                }
            }
        }
    }
}
