package chapter7.abstractdata;

import java.util.Scanner;

public class Client {

    static Employee[] employees = {new Employee("직원A", 400, false, 0),
            new Employee("직원B", 300, false, 0),
            new Employee("직원C", 250, false, 0),
            new Employee("아르바이트D", 1, true, 120),
            new Employee("아르바이트E", 1, true, 120),
            new Employee("아르바이트F", 1, true, 120)};

    public static void calculatePay(String name) {
        double taxRate = getTaxRate();
        Employee employee = null;
        for (Employee each : employees) {
            if (each.name.equals(name)) {
                employee = each;
                break;
            }
        }
        double pay = employee.calculatePay(taxRate);
        System.out.println(decribeResult(name, pay));
    }

    public static void sumOfBasePays() {
        int result = 0;
        Employee employee = null;
        for (Employee each : employees) {
            result += each.monthlyBasePay();
        }
        System.out.println(result);
    }

    private static String decribeResult(String name, double pay) {
        return "이름: " + name + ", 급여: " + pay;
    }

    private static double getTaxRate() {
        System.out.print("세율을 입력하세요: ");
        return new Scanner(System.in).nextDouble();
    }
}
