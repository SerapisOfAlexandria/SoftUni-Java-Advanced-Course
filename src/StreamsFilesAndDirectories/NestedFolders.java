package StreamsFilesAndDirectories;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Serapis\\Desktop\\Java\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        File directory = new File(path.toUri());

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(directory);

        int count = 1;

        while(!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File file : nestedFiles) {
                if (file.isDirectory()) {
                    dirs.offer(file);
                    count++;
                }
            }
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");
    }
}
