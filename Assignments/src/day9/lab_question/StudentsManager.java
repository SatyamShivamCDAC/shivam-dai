package day9.lab_question;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentsManager {

    public static List<Student> getStudentsByCourse(List<Student> students, String course) {
        return students.stream().filter(s -> s.getCourse().equals(course)).collect(Collectors.toList());
    }

    public static List<Student> getStudentsAboveCGPA(List<Student> students, float cgpa) {
        return students.stream().filter(s -> s.getCgpa() >= cgpa).collect(Collectors.toList());
    }

    public static Set<String> getStudentsCities(List<Student> students) {
        return students.stream().map(Student::getCity).collect(Collectors.toSet());
    }

    public static Map<String, Long> groupStudentsByCourse(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getCourse, Collectors.counting()));
    }

    public static List<Student> getTopNStudents(List<Student> students, int limit) {
        return students.stream().sorted(Comparator.comparing(Student::getCgpa).reversed()).limit(limit).collect(Collectors.toList());
    }
//
//    public static double averageCGPA(List<Student> students) {
//        return students.stream().reduce((s1, s2) -> )
//    }
}
