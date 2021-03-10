package strategy;

public class NoBonus implements BonusScheme {
    @Override
    public void applyTo(Money pay) {
        // no action
    }
}
