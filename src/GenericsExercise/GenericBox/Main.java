package GenericsExercise.GenericBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> boxList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Box<Integer> box = new Box(scanner.nextLine());
            boxList.add(box.toString());
        }

        boxList.forEach(System.out::print);
    }
}
