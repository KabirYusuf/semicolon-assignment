package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade {
    private  String studentName;
    private  double sub1Score;
    private  double sub2Score;
    private   double sub3Score;
    private  double total;
    private  double average;


    public StudentGrade(String studentName, double sub1Score, double sub2Score, double sub3Score, double total, double average){

        this.studentName = studentName;
        this.sub1Score = sub1Score;
        this.sub2Score = sub2Score;
        this.sub3Score = sub3Score;
        this.total = total;
        this.average = average;

    }

    public static void main(String[] args) {
        arraylist();

    }
    static void arraylist (){
        Scanner input = new Scanner(System.in);
        ArrayList<StudentGrade> studentGrades = new ArrayList<>();
        String classTeacher;
        String studentName;
        double sub1Score;
        double sub2Score;
        double sub3Score;
        double total = 0;
        double average;
        char addStudent;

        System.out.print("Teacher's Name: ");
        classTeacher = input.nextLine();

        do{
            System.out.print("Student Name: ");
            studentName = input.nextLine();

            System.out.print("Subject 1 score: ");
            sub1Score = input.nextDouble();



            System.out.print("Subject 2 score: ");
            sub2Score = input.nextDouble();


            System.out.print("Subject 3 score: ");
            sub3Score = input.nextDouble();



            total = sub1Score + sub2Score + sub3Score;

            average = total / 3;

            studentGrades.add(new StudentGrade(studentName, sub1Score, sub2Score,sub3Score, total, average));



            System.out.print("Enter Y to add student and N to stop: ");
            addStudent = input.next().charAt(0);
            input.nextLine();

        }

        while (addStudent =='Y' || addStudent == 'y');


        for(int i = 0; i <= 100;i++){
            System.out.print("=");
        }
        System.out.println();
        System.out.println();

        System.out.print("STUDENT \t\t SUB1 \t\t SUB2 \t\t SUB3 \t\t TOT \t\t AVG \t\t POS");

        System.out.println();
        System.out.println();

        for(int i = 0; i <= 100;i++){
            System.out.print("=");
        }

        System.out.println();


        for(StudentGrade s:studentGrades){
            s.printFormat();
        }

        for(int i = 0; i <= 70;i++){
            System.out.print("=");
        }
        System.out.println();

        for(int i = 0; i <= 70;i++){
            System.out.print("=");
        }

    }

    public  void printFormat(){


        System.out.printf("%-4s\t\t  %.2f\t\t  %.2f\t\t %.2f\t\t  %.2f\t\t  %.2f", studentName, sub1Score, sub2Score, sub3Score, total, average);
        System.out.println();


    }
}
