package day2.student;

public class Student {
    private int rollNumber;
    private String name;
    private int totalMarks;
    private int[] marks;

    public Student(int rollNumber, String name, int totalMarks, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.totalMarks = totalMarks;
        this.marks = marks;
    }

    private float calculateObtainedMarks() {
        float obtainedMarks = 0;
        for (int value : marks)
            obtainedMarks += value;
        return obtainedMarks;
    }

    public float calculateAverage() {
        return calculateObtainedMarks() / marks.length;
    }

    public float calculatePercentage() {
        return (calculateObtainedMarks() / totalMarks) * 100F;

    }
}