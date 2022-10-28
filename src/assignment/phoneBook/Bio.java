package assignment.phoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Bio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> bios = new ArrayList<>();

        int counter = 0;
        char addBio;

       do{
           System.out.print("Name: ");
           String name = "Name: " + input.nextLine();

           System.out.print("Address: ");
           String address = "Address: " +  input.nextLine();


           System.out.print("Telephone: ");
           String telephone = "Telephone: " +  input.nextLine();


           System.out.print("Email: ");
           String email = "Email: " +  input.nextLine();


           bios.add(name);
           bios.add(address);
           bios.add(telephone);
           bios.add(email);


           System.out.print(" Enter Y to Add Bio or N if there's no Bio to be added: ");
           addBio = input.next().charAt(0);
           input.nextLine();
       }

       while (addBio == 'y' || addBio == 'Y');


       for(String bio:bios) {

           System.out.println(bio);
           System.out.println();
       }


    }
}
