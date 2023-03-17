package chapter7.clasz;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, int basePay) {
        super(name, basePay);
    }

    @Override
    double calculatePay(double taxRate) {
        return basePay - (basePay * taxRate);
    }

    @Override
    int monthlyBasePay() {
        return basePay;
    }
}
