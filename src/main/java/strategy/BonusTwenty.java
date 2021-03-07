package strategy;

public class BonusTwenty implements BonusScheme{

    @Override
    public void applyTo(Money pay) {
        pay.add(new Money("20.00"));
    }
}
