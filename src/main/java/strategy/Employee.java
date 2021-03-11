package strategy;

public class Employee {
    private BonusScheme bonus;

    public Employee(BonusScheme bonus) {
        this.bonus = bonus;
    }

    Money totalPay() {
        Money pay = calculateBasePay();

        // use the strategy
        bonus.applyTo(pay);

        return pay;
    }

    private Money calculateBasePay() {
        // code then return ...
        return null;
    }
}

