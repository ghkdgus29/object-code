package chapter11.synthesis;

import chapter2.good.Money;

import java.time.Duration;

public class Client {
    public static void main(String[] args) {

        // 일반 요금제 -> 세금 정책
        Phone phone1 = new Phone(
                         new TaxablePolicy(
                                new RegularPolicy(Money.wons(1000), Duration.ofSeconds(10)),
                                 0.05));


        // 일반 요금제 -> 기본 요금 할인 정책 -> 세금 정책
        Phone phone2 = new Phone(
                new TaxablePolicy(
                        new RateDiscountablePolicy(
                                new RegularPolicy(Money.wons(1000), Duration.ofSeconds(10)),
                                Money.wons(500)),
                        0.05));


        // 일반 요금제 -> 세금 정책 -> 기본 요금 할인 정책
        Phone phone3 = new Phone(
                new RateDiscountablePolicy(
                        new TaxablePolicy(
                                new RegularPolicy(Money.wons(1000), Duration.ofSeconds(10)),
                                0.05),
                        Money.wons(1000)));


        // 심야할인 요금제 -> 세금 정책 -> 기본 요금 할인 정책
        Phone phone4 = new Phone(
                new RateDiscountablePolicy(
                        new TaxablePolicy(
                                new NightlyDiscountPolicy(Money.wons(700), Money.wons(1000), Duration.ofSeconds(10)),
                                0.05),
                        Money.wons(1000)
                )
        );

    }

}
