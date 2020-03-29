package Pesel;

import java.time.LocalDate;
import java.util.LinkedList;

public interface PeselInfosGetter {
    LocalDate getBirthDate(LinkedList<Integer> pesel);

    Gender getGender(LinkedList<Integer> pesel);
}
