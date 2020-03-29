import java.util.LinkedList;

public class PeselValidator {
    private static final int[] checkweights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

    private static boolean correctPesel(LinkedList<Integer> peselList) {
        int controlNumber = 0;
        for (int i = 0; i < 10; i++) {
            controlNumber += (peselList.get(i) * checkweights[i]) % 10;
        }
        return (controlNumber % 10) == (10 - peselList.get(10));
    }
}
