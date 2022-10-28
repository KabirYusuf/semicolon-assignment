package assignment.christmasSong;

public class ChristmasSong {
    public static void main(String[] args) {
        int day;
        for (day = 1; day <= 12; day++){
            System.out.println("On the" +" "+ day + " day of Christmas");
            System.out.println("my true love sent to me");

            switch (day){
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("Eleven pipers");
                case 10:
                    System.out.println("Ten lords a-leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a-milking");
                case 7:
                    System.out.println("seven swans a-swimming");
                case 6:
                    System.out.println("Six geese a-laying");
                case 5:
                    System.out.println("Five gold rings");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println("Three french hens");
                case 2:
                    System.out.println("Two turtledoves");
                default:
                    System.out.println("And a partridge in a pear tree");
            }
            System.out.println();
        }
    }
}
