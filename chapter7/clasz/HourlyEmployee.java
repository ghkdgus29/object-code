package chapter7.clasz;

public class HourlyEmployee extends Employee{

    private final int timeCard;

    public HourlyEmployee(String name, int basePay, int timeCard) {
        super(name, basePay);
        this.timeCard = timeCard;
    }

    @Override
    double calculatePay(double taxRate) {
        return (basePay * timeCard) - (basePay * timeCard) * taxRate;
    }

    @Override
    int monthlyBasePay() {
        return 0;
    }
}
