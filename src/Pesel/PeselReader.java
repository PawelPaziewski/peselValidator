package Pesel;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class PeselReader implements PeselReaderInterface {

    private long readedPesel;
    private LinkedList<Integer> pesel;

    public PeselReader() {
        this.readedPesel = readPesel();
        this.pesel = convertToIntArray(readedPesel);
    }

    public LinkedList<Integer> getPesel() {
        return pesel;
    }

    private long readPesel() {
        Scanner scanner = new Scanner(System.in);
        long pesel = 0L;
        boolean readed;
        do {
            readed = true;
            System.out.println("Give me your ID number: ");
            try {
                pesel = scanner.nextLong();
            } catch (InputMismatchException e) {
                System.out.println("Bad ID number!!");
                readed = false;
                scanner.nextLine();
            }
        } while (!readed || pesel > 99999999999L || pesel<10000000000L);
        return pesel;
    }

    private LinkedList<Integer> convertToIntArray(long pesel) {
        LinkedList<Integer> peselArray = new LinkedList<>();
        while (pesel != 0) {
            peselArray.add((int) (pesel % 10));
            pesel /= 10;
        }
        if (peselArray.size() != 11)//leading 0
            peselArray.add(0);
        Collections.reverse(peselArray);
        return peselArray;
    }
}
