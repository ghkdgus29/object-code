package chapter14.consistent;

import chapter2.good.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
