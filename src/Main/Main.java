package Main;

import Pesel.PeselMaster;

public class Main {
    public static void main(String[] args) {
        PeselMaster peselMaster = new PeselMaster(new Pesel.PeselReader(), new Pesel.PeselValidator(), new Pesel.PeselInfoSouter(), new Pesel.InfosGetter());
        peselMaster.runPeselValidation();
    }
}
