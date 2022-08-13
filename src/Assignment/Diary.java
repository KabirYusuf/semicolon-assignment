package Assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Diary {
    private DiaryArrayList diaryArrayList;
    Scanner input = new Scanner(System.in);

    public Diary(){
        diaryArrayList = new DiaryArrayList();
    }

    public void addInput(){
        System.out.println("Enter subject");
        String subject = input.nextLine();

        System.out.println("Enter Date");
        String date = input.nextLine();

        System.out.println("Enter Subject body");
        String entry = input.nextLine();

        diaryArrayList.addUserInput(date, subject, entry);
    }

    public void viewDiaryContent(){
        diaryArrayList.viewDiaryContent();
    }

    public  void viewSpecificDiaryContent(DiaryInput date){
        diaryArrayList.viewSpecificDiaryContent(date);
    }

    public static void main(String[] args) {
        DiaryInput diaryInput = new DiaryInput(null,null,null);
        Scanner input = new Scanner(System.in);
        Diary  diary = new Diary();

        System.out.println("Virtual Diary");
        System.out.println("Today is" + LocalDateTime.now());

        int option = 0;
        while(option != -1){
            System.out.print("Enter an option");
            System.out.println("\nSelect\n 1----To add content to diary\n 2----view diary content\n 3----view specific diary content\n-1---To close diary");
            option = input.nextInt();
            switch (option){
                case 1:
                    diary.addInput();
                    break;

                case 2:
                    diary.viewDiaryContent();
                    break;

                case 3:
                    System.out.println("Enter date");
                    input.nextLine();
                    String date = input.next();
                   // input.nextLine();
                    //diaryInput.setDate(date);
                    //diary.viewSpecificDiaryContent(date);

            }
        }

        System.out.print("");
    }



}
