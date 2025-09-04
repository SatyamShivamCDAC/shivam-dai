package day9.lab_question;

public enum Course {
    AI("Artificial Intelligence"),
    DAC("Advanced Computing"),
    DBDA("Big Data Analytics");

    private String description;

    Course(String description) {
        this.description = description;
    }
}
