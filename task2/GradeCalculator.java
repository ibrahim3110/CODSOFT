package task2;

import java.util.Scanner;

public class GradeCalculator {

    public int Maths,Science,English,Language,Social;
    public int totalMarks,averageMarks;

    public int totalMarks(){
        totalMarks = Maths + Science + English + Language + Social;
        return totalMarks;
    }

    public int averageMarks(){
        averageMarks = totalMarks()/5;
        return averageMarks;
    }

    public void grade(){
        if(averageMarks>9)
            System.out.println("Your grade is S");
        else if(averageMarks>8 & averageMarks<=9)
            System.out.println("Your grade is A");
        else if(averageMarks>7 & averageMarks<=8)
            System.out.println("Your grade is B");
        else if(averageMarks>6 & averageMarks<=7)
            System.out.println("Your grade is C");
        else if(averageMarks>5 & averageMarks<=6)
            System.out.println("Your grade is D");
        else if(averageMarks>4 & averageMarks<=5)
            System.out.println("Your grade is E");
        else
            System.out.println("Your grade is F. You have failed.");
    }

    public static void main(String[] args) {
        GradeCalculator student = new GradeCalculator();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Math marks :");
        student.Maths  = sc.nextInt();

        System.out.print("Enter your Science marks :");
        student.Science  = sc.nextInt();

        System.out.print("Enter your English marks :");
        student.English  = sc.nextInt();

        System.out.print("Enter your Language marks :");
        student.Language  = sc.nextInt();

        System.out.print("Enter your Social marks :");
        student.Social  = sc.nextInt();

        System.out.println("The total marks of the student is " + student.totalMarks());
        System.out.println("The average marks of the student is " + student.averageMarks());
        student.grade();
    }

}