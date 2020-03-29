package Pesel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PeselInfoSouter implements PeselInfoOuter {

    @Override
    public void outGenderInformation(Gender gender) {
        if (gender.equals(Gender.MALE))
            System.out.println("You are man");
        else
            System.out.println("You are woman");
    }

    @Override
    public void outBirthInformation(LocalDate birth) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Date of your birth is " + birth.format(dateTimeFormatter) + "r.");
    }

    @Override
    public void outCorrectInfo(boolean validate) {
        if (validate)
            System.out.println("It's correct ID number");
        else
            System.out.println("It's not correct ID number");
    }
}
