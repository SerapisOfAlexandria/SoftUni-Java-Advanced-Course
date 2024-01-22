package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt");) {

            int oneByte = fileInputStream.read();

            while (oneByte >= 0) {
                if (!(oneByte == 32 || oneByte == 10)) {
                    String byteToString = String.valueOf(oneByte);
                    char[] word = byteToString.toCharArray();

                    for (char ch : word) {
                        fileOutputStream.write(ch);
                    }
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
