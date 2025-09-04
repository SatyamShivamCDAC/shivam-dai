package day9.lab_question;

import java.time.LocalDate;

public class Student {
    private String pnr;
    private String name;
    private int age;
    private Course course;
    private float cgpa;
    private String city;
    private LocalDate enrollmentDate;

    public Student(String pnr, String name, int age, String course, float cgpa, String city, LocalDate enrollmentDate) {
        this.pnr = pnr;
        this.name = name;
        this.age = age;
        this.course = Course.valueOf(course);
        this.cgpa = cgpa;
        this.city = city;
        this.enrollmentDate = enrollmentDate;
    }

    public String toString() {
        return name;
    }

    public String getCourse() {
        return String.valueOf(course);
    }

    public float getCgpa() {
        return cgpa;
    }

    public String getCity() {
        return city;
    }
}
