package chapter7.clasz;

abstract class Employee {

    protected final String name;
    protected final int basePay;

    public Employee(String name, int basePay) {
        this.name = name;
        this.basePay = basePay;
    }

    abstract double calculatePay(double taxRate);

    abstract int monthlyBasePay();

}
