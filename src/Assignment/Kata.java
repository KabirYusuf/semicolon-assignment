package Assignment;

public class Kata {
    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public int price(int copies){
        int price = 0;
        if ((copies >=1) && (copies <=4)){
             price = copies * 2000;
        }
        else if((copies > 4) && (copies <=9)){
            price = copies * 1800;
        }
        else if((copies > 9) && (copies <=29)){
            price = copies * 1600;
        }
        else if((copies > 29) && (copies <=49)){
            price = copies * 1500;
        }

        else if((copies > 49) && (copies <=99)){
            price = copies * 1300;
        }
        else if((copies > 100) && (copies <=199)){
            price = copies * 1200;
        }
        else if((copies > 200) && (copies <=499)){
            price = copies * 1100;
        }
        else if(copies > 499 ){
            price = copies * 1500;
        }
        else {
            System.out.print("Number of copies is out of range");
        }
        return price;
    }
}
