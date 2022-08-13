package Assignment;

import java.time.LocalDateTime;
import java.util.Scanner;

public class DiaryInput {

    private String entry;

    private  String subject;
    private  String date;

    public DiaryInput(String date){this.date = date;}


    public DiaryInput(String date, String subject, String entry){
        this.entry = entry;
        this.subject = subject;
        this.date = date;
    }

    public  void setDate(String date){
        this.date = date;
    }
    public   String getDate(){
        return date;
    }
    public  void setEntry(String entry){
        this.entry = entry;
    }

    public  String getEntry(){
        return entry;
    }



    public String toString(){
        return  entry + subject + date;
    }

    public void printFormat(){
        System.out.printf("Diary Date: %s   Diary Subject: %s%n Content%n%s",date, subject, entry);
        System.out.println();
    }

    public void printFormatSearch(){
        System.out.printf("Content%n%s",entry);

    }

}
