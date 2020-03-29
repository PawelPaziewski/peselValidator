package Pesel;

import java.util.LinkedList;

public interface PeselInfoOutput {
    public void outSexInformation(LinkedList<Integer> pesel);
    public void outBirthInformation(LinkedList<Integer> pesel);
    public void outCorrectInfo(boolean validate);
}
