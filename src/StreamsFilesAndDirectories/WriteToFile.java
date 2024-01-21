package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\input.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt");) {

            Character[] chars = {'.',',','!','?'};
            Set<Character> punctuation = new HashSet<>(List.of(chars));
            int oneByte = fileInputStream.read();

            while (oneByte >= 0) {
                char ch = (char) oneByte;

                if (punctuation.contains(ch)) {

                } else {
                    fileOutputStream.write(oneByte);
                }
                oneByte = fileInputStream.read();
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
