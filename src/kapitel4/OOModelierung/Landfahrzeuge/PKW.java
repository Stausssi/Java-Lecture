package kapitel4.OOModelierung.Landfahrzeuge;

import kapitel4.OOModelierung.Groesse;
import kapitel4.OOModelierung.SpezielleGroesse;

public class PKW implements Groesse, SpezielleGroesse {
    @Override
    public int getLaenge() {
        return 120;
    }

    @Override
    public int getABC() {
        return 19234;
    }
}
