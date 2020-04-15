package Pesel;

import java.time.LocalDate;
import java.util.LinkedList;

public class InfosGetter implements PeselInfosGetter {

    @Override
    public LocalDate getBirthDate(LinkedList<Integer> pesel) {
        LocalDate birthDay;
        if (pesel.get(2) == 2 || pesel.get(2) == 3) //it's someone from 21th century
        {

            int year = 2000 + pesel.get(0) * 10 + pesel.get(1);
            int month = (pesel.get(2) - 2) * 10 + (pesel.get(3));
            int day = pesel.get(4) * 10 + pesel.get(5);
            birthDay = LocalDate.of(year, month, day);
        } else {
            int year = 1900 + pesel.get(0) * 10 + pesel.get(1);
            int month = pesel.get(2) * 10 + pesel.get(3);
            int day = pesel.get(4) * 10 + pesel.get(5);
            birthDay = LocalDate.of(year, month, day);
        }
        return birthDay;
    }

    @Override
    public Gender getGender(LinkedList<Integer> pesel) {
        if (pesel.get(9) % 2 == 0)
            return Gender.FAMALE;
        return Gender.MALE;
    }

}
