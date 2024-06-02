package Jiya07;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
	public class QuizApplication {
	    static int score = 0;
	    static int questionNumber = 1;

	    public static void main(String[] args) {
	        String[][] questions = {
	                {"What is the capital of France?", "A. London", "B. Paris", "C. Rome", "D. Berlin", "B"},
	                {"Which planet is known as the Red Planet?", "A. Venus", "B. Mars", "C. Jupiter", "D. Saturn", "B"},
	                {"Who wrote Romeo and Juliet?", "A. Charles Dickens", "B. Jane Austen", "C. William Shakespeare", "D. Mark Twain", "C"}
	        };

	        Timer timer = new Timer();
	        TimerTask task = new TimerTask() {
	            @Override
	            public void run() {
	                System.out.println("Time's up! Moving to the next question.");
	                questionNumber++;
	                displayQuestion(questions, timer, this);
	            }
	        };

	        displayQuestion(questions, timer, task);
	    }

	    public static void displayQuestion(String[][] questions, Timer timer, TimerTask task) {
	        if (questionNumber > questions.length) {
	            timer.cancel();
	            System.out.println("Quiz completed! Your final score is: " + score);
	            return;
	        }

	        String[] currentQuestion = questions[questionNumber - 1];

	        System.out.println("Question " + questionNumber + ": " + currentQuestion[0]);
	        for (int i = 1; i < currentQuestion.length - 1; i++) {
	            System.out.println(currentQuestion[i]);
	        }

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter your answer (A, B, C, or D): ");
	        String userAnswer = input.next().toUpperCase();

	        if (userAnswer.equals(currentQuestion[currentQuestion.length - 1])) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is: " + currentQuestion[currentQuestion.length - 1]);
	        }

	        questionNumber++;
	        timer.schedule(task, 10000); // 10 seconds timer for each question
	    }
	}
