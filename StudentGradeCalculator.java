package Jiya07;

import java.util.Scanner;
public class StudentGradeCalculator{

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int totalSubjects;
	        System.out.print("Enter the total number of subjects: ");
	        totalSubjects = input.nextInt();

	        int totalMarks = 0;
	        for (int i = 1; i <= totalSubjects; i++) {
	            System.out.print("Enter marks obtained in subject " + i + ": ");
	            totalMarks += input.nextInt();
	        }

	        double averagePercentage = (double) totalMarks / totalSubjects;

	        char grade;

	        if (averagePercentage >= 90) {
	            grade = 'A';
	        } else if (averagePercentage >= 80) {
	            grade = 'B';
	        } else if (averagePercentage >= 70) {
	            grade = 'C';
	        } else if (averagePercentage >= 60) {
	            grade = 'D';
	        } else if (averagePercentage >= 50) {
	            grade = 'E';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);

	        input.close();
	    }
	}

