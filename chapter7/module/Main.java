package chapter7.module;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String operation = ":pay";
//        String operation = ":basePays";

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

    public static void calculatePay(String name) {
        double taxRate = getTaxRate();
        double pay = Employees.calculatePay(name, taxRate);
        System.out.println(decribeResult(name, pay));
    }

    public static double getTaxRate() {
        System.out.print("세율을 입력하세요: ");
        return new Scanner(System.in).nextDouble();
    }

    public static String decribeResult(String name, double pay) {
        return "이름: " + name + ", 급여: " + pay;
    }

    public static void sumOfBasePays() {
        System.out.println(Employees.sumOfBasePays());
    }

}
