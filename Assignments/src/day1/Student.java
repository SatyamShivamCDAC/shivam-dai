package day1;

import java.util.Scanner;

public class Student {
	private int rollNumber;
	private String name;
	private static int numberOfStudents;
	
	public Student() {
		rollNumber = 0;
		name = "";
	}
	
	public Student(String name) {
		this.rollNumber = ++numberOfStudents;
		this.name = name;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "\nday1.Student Details >\nRoll Number: " + rollNumber + "\nName: " + name;
	}
	
	public static void displayNumberOfStudents() {
		System.out.println("Number of Students: " + numberOfStudents);
	}
	
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("Satyam");
		Student student3 = new Student("Shivam");
		Student student4 = new Student();
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		displayNumberOfStudents();
		
		Scanner scanner = new Scanner(System.in);
		
		Student[] students = new Student[5];
		System.out.println("\nEnter names for following students: ");
		for (int i = 0; i < students.length; i++) {
			System.out.print("[" + (numberOfStudents + 1) + "]: ");
			String name = scanner.nextLine();
			students[i] = new Student(name);
		}

		System.out.println(students[2].getName());
		
	}
}
