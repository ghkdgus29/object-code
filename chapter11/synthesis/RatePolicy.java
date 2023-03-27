package chapter11.synthesis;

import chapter2.good.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
