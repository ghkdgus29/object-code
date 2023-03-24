package chapter11;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Lecture lecture = new Lecture(70,
                "객체지향 프로그래밍",
                Arrays.asList(81, 95, 75, 50, 45));

        System.out.println(lecture.evaluate());

        GradeLecture gradeLecture = new GradeLecture(70,
                "객체지향 프로그래밍",
                Arrays.asList(81, 95, 75, 50, 45),
                Arrays.asList(new Grade("A", 100, 95),
                        new Grade("B", 94, 80),
                        new Grade("C", 79, 70),
                        new Grade("D", 69, 50),
                        new Grade("F", 49, 0)));

        System.out.println(gradeLecture.evaluate());

        Professor professor1 = new Professor("다익스트라",
                new Lecture(70, "알고리즘",
                        Arrays.asList(81, 95, 75, 50, 45)));

        System.out.println(professor1.compileStatistics());


        Professor professor2 = new Professor("다익스트라",
                new GradeLecture(70, "알고리즘",
                        Arrays.asList(81, 95, 75, 50, 45),
                        Arrays.asList(new Grade("A", 100, 95),
                                new Grade("B", 94, 80),
                                new Grade("C", 79, 70),
                                new Grade("D", 69, 50),
                                new Grade("F", 49, 0))));

        System.out.println(professor2.compileStatistics());
    }
}
