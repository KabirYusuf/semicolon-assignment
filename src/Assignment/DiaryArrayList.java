package Assignment;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DiaryArrayList {
    ArrayList<DiaryInput> diaryInputs = new ArrayList<>();

    public void addUserInput(String date, String subject, String entry) {
        diaryInputs.add(new DiaryInput(date, subject, entry));
    }

    public void viewDiaryContent() {
        System.out.println(LocalDateTime.now());
        for (DiaryInput d : diaryInputs) {
//            System.out.print(d);
//            System.out.println();
            d.printFormat();
        }
    }

//    public void findMyDiary(String date, String subject,String entry ){
//        DiaryInput diaryInput = new DiaryInput(date,subject,entry);
//        for (DiaryInput n : diaryInputs){
//            if (diaryInput.getDate().equals(date)){
//                System.out.println( diaryInput);
//            }
//        }
//        //return null;
//    }

//    public void viewSpecificDiary(String date, String subject, String entry){
//        findMyDiary(date, subject, entry);
////        System.out.println(find);
//    }

    public void viewSpecificDiaryContent(DiaryInput date){
        boolean contentSearchByDate = diaryInputs.contains(date);
        for(DiaryInput diaryInput:diaryInputs){
            if(contentSearchByDate){
                //diaryInput.getEntry();
                System.out.println(diaryInput.getEntry());
            }
        }
//
//        System.out.println(diaryInput.getEntry());
//
    }

}
