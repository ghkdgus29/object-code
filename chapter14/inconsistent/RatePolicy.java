package chapter14.inconsistent;

import chapter2.good.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
