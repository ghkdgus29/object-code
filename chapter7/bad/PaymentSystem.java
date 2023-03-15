package chapter7.bad;

import java.util.List;
import java.util.Scanner;

public class PaymentSystem {

    private static Scanner sc = new Scanner(System.in);
    private static List<String> employees = List.of("직원A", "직원B", "직원C", "아르바이트D", "아르바이트E", "아르바이트F");
    private static double[] basePays = {400, 300, 250, 1, 1, 1.5};
    private static boolean[] hourlys = {false, false, false, true, true, true};
    private static int[] timeCards = {0, 0, 0, 120, 120, 120};

    public static void main(String[] args) {
//        String operation = ":pay";
        String operation = ":basePays";

        switch (operation) {
            case ":pay":
                String name = "직원B";
                calculatePay(name);
                break;
            case ":basePays":
                sumOfBasePays();
                break;
        }

    }

    public static Double getTaxRate() {
        System.out.print("세율을 입력하세요: ");
        return sc.nextDouble();
    }

    public static void calculatePay(String name) {
        double taxRate = getTaxRate();
        double pay;

        if (hourly(name)) {
            pay = calculateHourlyPayFor(name, taxRate);
        } else {
            pay = calculatePayFor(name, taxRate);
        }

        System.out.println(decribeResult(name, pay));
    }

    public static double calculatePayFor(String name, double taxRate) {
        int index = employees.indexOf(name);
        double basePay = basePays[index];
        return basePay - (basePay * taxRate);
    }

    public static double calculateHourlyPayFor(String name, double taxRate) {
        int index = employees.indexOf(name);
        double basePay = basePays[index] * timeCards[index];
        return basePay - (basePay * taxRate);
    }

    public static String decribeResult(String name, double pay) {
        return "이름: " + name + ", 급여: " + pay;
    }

    public static void sumOfBasePays() {
        int result = 0;
        for (String name : employees) {
            if (!hourly(name)) {
                result += basePays[employees.indexOf(name)];
            }
        }
        System.out.println(result);
    }

    public static boolean hourly(String name) {
        return hourlys[employees.indexOf(name)]
    }
}
