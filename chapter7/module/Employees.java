package chapter7.module;

import java.util.List;

public class Employees {

    static List<String> employees = List.of("직원A", "직원B", "직원C", "직원D", "직원E", "직원F");
    static double[] basePays = {400, 300, 250, 1, 1, 1.5};
    static Boolean[] hourlys = {false, false, false, true, true, true};
    static int[] timeCards = {0, 0, 0, 120, 120, 120};

    public static double calculatePay(String name, double taxRate) {
        if (hourly(name)) {
            return calculateHourlyPayFor(name, taxRate);
        } else {
            return calculatePayFor(name, taxRate);
        }
    }

    public static boolean hourly(String name) {
        return hourlys[employees.indexOf(name)];
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

    public static int sumOfBasePays() {
        int result = 0;
        for (String name : employees) {
            if (!hourly(name)) {
                result += basePays[employees.indexOf(name)];
            }
        }
        return result;
    }
}
