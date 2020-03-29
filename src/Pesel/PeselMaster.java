package Pesel;

import java.time.LocalDate;
import java.util.LinkedList;

public class PeselMaster {

    private PeselReaderInterface reader;
    private PeselValidator validator;
    private PeselInfoOuter peselOut;
    private PeselInfosGetter infosGetter;

    public PeselMaster(PeselReaderInterface reader, PeselValidator validator, PeselInfoOuter peselOut, PeselInfosGetter infosGetter) {
        this.reader = reader;
        this.validator = validator;
        this.peselOut = peselOut;
        this.infosGetter = infosGetter;
    }

    public void runPeselValidation() {
        LinkedList<Integer> pesel = reader.getPesel();
        peselOut.outCorrectInfo(validator.validate(pesel));
        if (validator.validate(pesel)) {
            LocalDate birthDate = infosGetter.getBirthDate(pesel);
            Gender gender = infosGetter.getGender(pesel);
            peselOut.outGenderInformation(gender);
            peselOut.outBirthInformation(birthDate);
        }
    }
}
