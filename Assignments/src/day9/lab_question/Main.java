package day9.lab_question;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Student shivam = new Student("101", "Shivam", 23, "AI", 9.7F, "Nanded", LocalDate.of(2025, 6, 1));
        Student satyam = new Student("102", "Satyam", 24, "AI", 9.1F, "Indore", LocalDate.of(2025, 7, 15));
        Student piyush = new Student("103", "Piyush", 21, "AI", 8.3F, "Mumbai", LocalDate.of(2025, 3, 11));
        Student naveen = new Student("104", "Naveen", 29, "DAC", 8.7F, "Delhi", LocalDate.of(2025, 2, 25));
        Student abhinav = new Student("105", "Abhinav", 22, "DBDA", 9.2F, "Indore", LocalDate.of(2025, 8, 21));
        Student rachit = new Student("106", "Rachit", 22, "DAC", 8.3F, "Pune", LocalDate.of(2025, 8, 16));

        List<Student> students = List.of(shivam, satyam, piyush, naveen, abhinav, rachit);

        System.out.println("AI students:");
        StudentsManager.getStudentsByCourse(students, "AI").forEach(System.out::println);

        System.out.println("\nDAC students: ");
        StudentsManager.getStudentsByCourse(students, "DAC").forEach(System.out::println);

        System.out.println("\nStudents above CGPA 9:");
        StudentsManager.getStudentsAboveCGPA(students, 9F).forEach(System.out::println);

        System.out.println("\nCities of Students:");
        StudentsManager.getStudentsCities(students).forEach(System.out::println);

        System.out.println("\nAverage CGPA of all students:");
        System.out.println(StudentsManager.getAverageCGPA(students));

        System.out.println("\nTop 3 Students:");
        StudentsManager.getTopNStudents(students, 3).forEach(System.out::println);

        System.out.println("\nStudents count by courses:");
        Map<String, Long> studentsCountByCourse = StudentsManager.groupStudentsByCourse(students);
        for (String course : studentsCountByCourse.keySet())
            System.out.println(course + " " + studentsCountByCourse.get(course));
    }
}
