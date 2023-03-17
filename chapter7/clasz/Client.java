package chapter7.clasz;

public class Client {

    static Employee[] employees = {new SalariedEmployee("직원A", 400),
            new SalariedEmployee("직원B", 300),
            new HourlyEmployee("아르바이트C", 1, 120)};

    public static void sumOfBasePays() {
        int result = 0;
        for (Employee employee : employees) {
            result += employee.monthlyBasePay();
        }

        System.out.println(result);
    }
}
