package Assignment;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.printf("Select from the list of options below: %n 1. Phone book %n " +
                "2. Messages %n 3. Chat %n 4. Call register %n 5. Tones %n 6. Settings %n 7. Call divert %n " +
                "8. Games %n 9. Calculator %n 10. Reminders %n 11. Clock %n 12. Profiles %n 13. Sim services %n Enter number: ");

        int userEntry4MainMenu = input.nextInt();
        switch (userEntry4MainMenu){
            case 1:
                System.out.printf("Phone book menu %n 1. Search %n 2. Service Nos %n 3. Add name %n 4.Erase %n 5. Edit %n" +
                        " 6. Assign tone %n 7. Send b\'card %n 8. Options %n 9. Speed dials %n 10. Voice tags%n Enter number or 8" +
                        " for more options menu: ");
                int userEntry4PhoneBook = input.nextInt();
                switch (userEntry4PhoneBook){
                    case 1:
                        System.out.print("Search");
                        break;
                    case 2:
                        System.out.print("Service Nos");
                        break;
                    case 3:
                        System.out.print("Add name");
                        break;
                    case 4:
                        System.out.print("Erase");
                        break;
                    case 5:
                        System.out.print("Edit");
                        break;
                    case 6:
                        System.out.print("Assign tone");
                        break;
                    case 7:
                        System.out.print("Send b\'card");
                        break;
                    case 8:
                        System.out.printf("Options%n 1. Type of view%n 2. Memory status%n Enter number: ");
                        int userEntry4OptionsMenu = input.nextInt();
                        switch (userEntry4OptionsMenu){
                            case 1:
                                System.out.print("Type of view");
                                break;
                            case 2:
                                System.out.print("Memory status");
                                break;
                            default:
                                System.out.print("Wrong input");
                                break;
                        }

                        break;
                    case 9:
                        System.out.print("Speed dials");
                        break;
                    case 10:
                        System.out.print("Voice tags");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                        }

                break;
            case 2:
                System.out.printf("Messages menu %n 1. Write message%n 2. Inbox%n 3. Outbox%n 4. Picture messages%n" +
                        " 5. Template%n 6. Smileys%n 7. Message setting%n 8. Info services%n 9. Voice mailbox number%n" +
                        " 10. Service command editor%n Enter number or 7 for message settings option: ");
                int userEntry4Message = input.nextInt();
                switch (userEntry4Message) {
                    case 1:
                        System.out.print("Write message");
                        break;
                    case 2:
                        System.out.print("Inbox");
                        break;
                    case 3:
                        System.out.print("Outbox");
                        break;
                    case 4:
                        System.out.print("Picture message");
                        break;
                    case 5:
                        System.out.print("Template");
                        break;
                    case 6:
                        System.out.print("Smileys");
                        break;
                    case 7:
                        System.out.printf("Message Setting%n 1. Set%n 2. Common%n Enter number: ");
                        int userEntry4MessageSetting = input.nextInt();
                        switch (userEntry4MessageSetting){
                            case 1:
                                System.out.printf("Set%n 1. Message center number%n 2. Message sent as%n 3. Message validity%n Enter number: ");
                                int userEntry4Set = input.nextInt();
                                switch (userEntry4Set){
                                    case 1:
                                        System.out.print("Message center number");
                                        break;
                                    case 2:
                                        System.out.print("Message sent");
                                        break;
                                    case 3:
                                        System.out.print("Message validity");
                                        break;
                                    default:
                                        System.out.print("Wrong input");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.printf("Common%n 1. Delivery  report%n 2. Reply via same center%n 3. Character support%n Enter number: ");
                                int userEntry4Common = input.nextInt();
                                switch (userEntry4Common){
                                    case 1:
                                        System.out.print("Delivery report");
                                        break;
                                    case 2:
                                        System.out.print("Reply via same center");
                                        break;
                                    case 3:
                                        System.out.print("Character support");
                                        break;
                                    default:
                                        System.out.println("Wrong input");
                                        break;
                                }
                                break;
                            default:
                                System.out.print("Wrong input");
                                break;
                        }

                        break;
                    case 8:
                        System.out.print("Info services");
                        break;
                    case 9:
                        System.out.print("Voice mailbox number");
                        break;
                    case 10:
                        System.out.print("Service command editor");
                        break;
                    default:
                        System.out.print("Wrong input");
                        break;
                }
                break;
            case 3:
                System.out.print("Chat");
                break;
            case 4:
                System.out.printf("Call register %n 1. Missed calls%n 2. Received calls%n 3. Dialled numbers%n 4. Erase recent call lists%n" +
                        " 5. Show call duration%n 6. Show call cost%n 7. Call cost setting%n 8. Prepaid credit%n Enter number or 5,6,7 for more options: ");
                int userEntry4CallRegister = input.nextInt();
                switch (userEntry4CallRegister){
                    case 1:
                        System.out.print("Missed calls");
                        break;
                    case 2:
                        System.out.print("Received calls");
                        break;
                    case 3:
                        System.out.print("Dialled calls");
                        break;
                    case 4:
                        System.out.print("Erase recent call lists");
                        break;
                    case 5:
                        System.out.printf("Show call duration%n 1. Last call duration%n 2. All calls duration%n 3. Received call duration%n 4. Dialled calls duration%n" +
                                " 5. Clear timers%n Enter number: ");
                        int userEntry4ShowCallDuration = input.nextInt();
                        switch (userEntry4CallRegister){
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.print("All calls duration");
                                break;
                            case 3:
                                System.out.print("Received call duration");
                                break;
                            case 4:
                                System.out.print("Dialled calls duration");
                                break;
                            case 5:
                                System.out.print("Clear timers");
                                break;
                            default:
                                System.out.println("Wrong input");

                        }
                        break;
                    case 6:
                        System.out.printf("Show call cost%n 1. Last call cost%n 2. All call cost%n 3. Clear counters%n Enter number: ");
                        int userEntry4ShowCallCost = input.nextInt();
                        switch (userEntry4ShowCallCost) {
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.print("All calls cost");
                                break;
                            case 3:
                                System.out.print("Clear counters");
                                break;
                            default:
                                System.out.print("Wrong input");
                                break;
                        }
                        break;
                    case 7:
                        System.out.printf("Call cost setting%n 1. Call cost limit%n 2. Show costs in%n Enter number: ");
                        int userEntry4CallCostSetting = input.nextInt();
                        switch (userEntry4CallCostSetting) {
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.print("Show costs in");
                                break;
                            default:
                                System.out.print("Wrong input");
                                break;
                        }
                        break;
                    case 8:
                        System.out.print("Prepaid credit");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
            case 5:
                System.out.printf("Tones menu%n 1. Ringing tone%n 2. Ringing volume%n 3. Incoming call alert%n 4. Composer%n" +
                        " 5. Message alert tone%n 6. keypad tones%n 7. Warning and games tones%n 8. Vibrating alert%n 9. Screen saver%n Enter number:  ");
                int userEntry4Tones = input.nextInt();
                switch (userEntry4Tones){
                    case 1:
                        System.out.print("Ringing tone");
                        break;
                    case 2:
                        System.out.print("Ringing volume");
                        break;
                    case 3:
                        System.out.print("Incoming call alert");
                        break;
                    case 4:
                        System.out.print("Composer");
                        break;
                    case 5:
                        System.out.print("Message alert tone");
                        break;
                    case 6:
                        System.out.print("Keypad tones");
                        break;
                    case 7:
                        System.out.print("Warning and games tone");
                        break;
                    case 8:
                        System.out.print("Vibrating alert");
                        break;
                    case 9:
                        System.out.print("Screen saver");
                        break;
                    default:
                        System.out.print("Wrong input");
                }

                break;
            case 6:
                System.out.printf("Settings menu%n 1. Call settings%n 2. Phone settings%n 3. Security settings%n 4. Restore factory settings%n Enter number or 1,2,3 for more options: ");
                int userEntry4Settings = input.nextInt();
                switch (userEntry4Settings){
                    case 1:
                        System.out.printf("Call settings menu%n 1. Automatic redial%n 2. Speed dialing%n 3. Call waiting option%n 4. Own number sending%n 5. Phone line in use%n 6. Automatic answer%n Enter number: ");
                        int userEntry4CallSettings = input.nextInt();
                        switch (userEntry4CallSettings){
                            case 1:
                                System.out.print("Automatic redial");
                                break;
                            case 2:
                                System.out.print("Speed dialing");
                                break;
                            case 3:
                                System.out.print("Call waiting option");
                                break;
                            case 4:
                                System.out.print("Own number sending");
                                break;
                            case 5:
                                System.out.print("Phone line in use");
                                break;
                            case 6:
                                System.out.print("Automatic answer");
                                break;
                            default:
                                System.out.print("Wrong input");
                                break;
                        }
                        break;
                    case 2:
                        System.out.printf("Phone settings%n 1. Language%n 2. Cell info display%n 3. Welcome note%n 4. Network selection%n 5. lights%n 6. Confirm sim service action%n Enter number: ");
                        int userEntry4PhoneSettings = input.nextInt();
                        switch (userEntry4PhoneSettings){
                            case 1:
                                System.out.print("Language");
                                break;
                            case 2:
                                System.out.print("Cell info display");
                                break;
                            case 3:
                                System.out.print("Welcome note");
                                break;
                            case 4:
                                System.out.print("Network selection");
                                break;
                            case 5:
                                System.out.print("Lights");
                                break;
                            case 6:
                                System.out.print("Confirm sim service action");
                                break;
                            default:
                                System.out.print("Wrong input");
                                break;

                        }
                        break;
                    case 3:
                        System.out.printf("Security settings menu%n 1. PIN code request%n 2. Call baring service%n 3. Fixed dialling%n 4. Closed user group%n " +
                                "5. Phone security%n 6. Change access codes%n Enter number: ");
                        int userEntry4SecuritySettingsMenu = input.nextInt();
                        switch (userEntry4SecuritySettingsMenu){
                            case 1:
                                System.out.print("PIN code request");
                                break;
                            case 2:
                                System.out.print("Call baring service");
                                break;
                            case 3:
                                System.out.print("Fixed dialling");
                                break;
                            case 4:
                                System.out.print("Closed user group");
                                break;
                            case 5:
                                System.out.print("Phone security");
                                break;
                            case 6:
                                System.out.print("Change access code");
                                break;
                            default:
                                System.out.print("Wrong input");
                                break;
                        }
                        break;
                    case 4:
                        System.out.print("Restore factory settings");
                        break;
                    default:
                        System.out.print("Wrong input");
                        break;
                }
               break;
            case 7:
                System.out.print("Call divert");
                break;
            case 8:
                System.out.print("Games");
                break;
            case 9:
                System.out.print("Calculator");
                break;
            case 10:
                System.out.print("Reminders");
                break;
            case 11:
                System.out.printf("Clock menu%n 1. Alarm clock%n 2. Clock settings%n 3. Date settings%n 4. Stopwatch%n 5. Countdown timer%n 6. Auto update of date and time%n Enter number: ");
                int userEntry4ClockMenu = input.nextInt();
                switch (userEntry4ClockMenu){
                    case 1:
                        System.out.print("Alarm clock");
                        break;
                    case 2:
                        System.out.print("Clock settings");
                        break;
                    case 3:
                        System.out.print("Date settings");
                        break;
                    case 4:
                        System.out.print("Stopwatch");
                        break;
                    case 5:
                        System.out.print("Countdown timer");
                        break;
                    case 6:
                        System.out.print("Auto update of date and time");
                        break;
                    default:
                        System.out.print("Wrong input");
                        break;
                }

                break;
            case 12:
                System.out.print("Profiles");
                break;
            case 13:
                System.out.print("SIM services");
                break;
            default:
                System.out.print("Wrong input for main menu");
                break;
            }


    }
}
