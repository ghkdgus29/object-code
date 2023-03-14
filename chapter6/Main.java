package chapter6;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Event meeting = new Event("회의",
                LocalDateTime.of(2019, 5, 9, 10, 30),
                Duration.ofMinutes(30));

        RecurringSchedule schedule = new RecurringSchedule("회의", DayOfWeek.WEDNESDAY,
                LocalTime.of(10, 30), Duration.ofMinutes(30));

        assert meeting.isSatisfied(schedule) == false;
        assert meeting.isSatisfied(schedule) == true;       // 명령과 쿼리가 분리되지 않아 참사 발생
    }
}
