package behaviours;

import instruments.Instrument;

public interface IControlMoney {

    void increaseMoney(Instrument inputInstrument);

    void decreaseMoney(Instrument inputInstrument);

}
