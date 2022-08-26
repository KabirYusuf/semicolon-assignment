package Assignment.ArrayAndList;

import java.util.Arrays;

public class Question {

    public static int largestElement(int [] array) {
        int largestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > largestNumber){
                largestNumber = array[i];
            }
        }
        return largestNumber;
    }

    public static String arrayReverse(int [] array) {
        int [] reverse = new int[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0 ; i--) {
            reverse[count] = array[i];
            count++;
        }
        String reverseResult = Arrays.toString(reverse);
        return reverseResult;

    }

    public static boolean isContain(int [] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }

    public static String oddPositionNumbers(int [] array) {
        String values = "";
        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0){
                values += array[i];
            }
        }
        return values;
    }

    public static String evenPositionNumbers(int [] array) {
        String values = "";
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0){
                values += array[i];
            }
        }
        return values;
    }

    public static boolean isPalindrome(String value) {
        int valueLength = value.length();
        String reverse = "";
        for (int i = valueLength - 1; i >= 0; i--) {
            reverse += value.charAt(i);
            if(value.equals(reverse)){
                return true;
            }
        }
        return false;
    }

    public static void alternative(String[] array1,String[] array2){
        String [] result = new String[array1.length + array2.length];
        int count = 0;

        for (int j = 0; j < array2.length; j++) {
            result[count] = array2[j];
            count++;
            result[count] = array1[j];
            count++;
        }


        System.out.println(Arrays.toString(result));
    }
}
