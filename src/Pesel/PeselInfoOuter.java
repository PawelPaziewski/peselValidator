package Pesel;

import java.time.LocalDate;
import java.util.LinkedList;

public interface PeselInfoOuter {
    void outGenderInformation(Gender gender);

    void outBirthInformation(LocalDate birth);

    void outCorrectInfo(boolean validate);
}
