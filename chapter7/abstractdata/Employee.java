package chapter7.abstractdata;

public class Employee {

    public String name;
    public int basePay;
    public boolean hourly;
    public double timeCard;

    public Employee(String name, int basePay, boolean hourly, double timeCard) {
        this.name = name;
        this.basePay = basePay;
        this.hourly = hourly;
        this.timeCard = timeCard;
    }

    public double calculatePay(double taxRate) {
        if (hourly) {
            return calculateHourlyPay(taxRate);
        }
        return calculateSalariedPay(taxRate);
    }

    public int monthlyBasePay() {
        if (hourly) {
            return 0;
        }
        return basePay;
    }

    private double calculateHourlyPay(double taxRate) {
        return (basePay * timeCard) - (basePay * timeCard) * taxRate;
    }

    private double calculateSalariedPay(double taxRate) {
        return basePay - (basePay * taxRate);
    }
}
