package behaviours;

import instruments.Instrument;

public interface IControlMoney {

    double getMoneyAmount();
    void increaseMoney(Instrument inputInstrument);

    void decreaseMoney(Instrument inputInstrument);

}
