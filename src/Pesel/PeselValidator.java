package Pesel;

import java.util.LinkedList;

public class PeselValidator implements PeselValidatorInterface {
    private static final int[] checkweights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

    @Override
    public boolean validate(LinkedList<Integer> peselList) {
        int controlNumber = 0;
        for (int i = 0; i < 10; i++) {
            controlNumber += (peselList.get(i) * checkweights[i]) % 10;
        }
        return (controlNumber % 10) == (10 - peselList.get(10));
    }
}
