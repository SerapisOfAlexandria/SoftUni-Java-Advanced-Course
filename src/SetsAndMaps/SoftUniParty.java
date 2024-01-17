package SetsAndMaps;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeSet<String> regularGuests = new TreeSet<>();
        TreeSet<String> vipGuests = new TreeSet<>();

        String invitedGuest = scanner.nextLine();

        while (!invitedGuest.equals("PARTY")) {
            if (invitedGuest.charAt(0) >= '0' && invitedGuest.charAt(0) <= '9' && invitedGuest.length() == 8) {
                vipGuests.add(invitedGuest);
            } else if (invitedGuest.length() == 8) {
                regularGuests.add(invitedGuest);
            }

            invitedGuest = scanner.nextLine();
        }

        String attendedGuest = scanner.nextLine();

        while (!attendedGuest.equals("END")) {
            if (vipGuests.contains(attendedGuest)) {
                vipGuests.remove(attendedGuest);
            } else {
                regularGuests.remove(attendedGuest);
            }

            attendedGuest = scanner.nextLine();
        }

        System.out.println(vipGuests.size() + regularGuests.size());
        if (!(vipGuests.size() == 0)) {
            System.out.println(vipGuests.stream().collect(Collectors.joining("\n")));
        }
        if (!(regularGuests.size() == 0)) {
            System.out.println(regularGuests.stream().collect(Collectors.joining("\n")));
        }
    }
}
