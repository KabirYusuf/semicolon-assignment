package assignment.myersBrigs;

import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args) {
        questionnaire();
        questionnaireAnswer();
    }
    private final static int [][] personality = new int[4][2];


    static void questionnaire(){
        String answer;
        Scanner input = new Scanner(System.in);
        personality[0][0] = 0;
        personality[0][1] = 0;
        personality[1][0] = 0;
        personality[1][1] = 0;
        personality[2][0] = 0;
        personality[2][1] = 0;
        personality[3][0] = 0;
        personality[3][1] = 0;

        for(int i = 1; i <= 20; i++){
            System.out.println("Select A/B");

            switch (i) {
                case 1 -> {
                    System.out.println("""
                                1.
                            A. Expend energy, enjoy groups.
                            B. Conserve energy, enjoy one-on-one.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else {
                        personality[0][1]++;
                    }
                }
                case 2 -> {
                    System.out.println("""
                                2.
                            A. more outgoing, think out loud.
                            B. More reserved, think to yourself.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else {
                        personality[0][1]++;
                    }
                }
                case 3 -> {
                    System.out.println("""
                                3.
                            A. Seek many tasks, public activities, interaction with others.
                            B. Seek private, solitary activities with quiet to concentrate.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else {
                        personality[0][1]++;
                    }
                }
                case 4 -> {
                    System.out.println("""
                                4.
                            A. External, communicative, express yourself.
                            B. Internal, reticent, keep to yourself.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else {
                        personality[0][1]++;
                    }
                }
                case 5 -> {
                    System.out.println("""
                                5.
                            A. Active, initiate.
                            B. Reflective, deliberate.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[0][0]++;
                    } else {
                        personality[0][1]++;
                    }
                }
                case 6 -> {
                    System.out.println("""
                                6.
                            A. Interpret literally.
                            B. Look for meaning and possibilities.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[1][0]++;
                    } else {
                        personality[1][1]++;
                    }
                }
                case 7 -> {
                    System.out.println("""
                                7.
                            A. Practical, realistic, experimental.
                            B. Imaginative, innovative, theoretical.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[1][0]++;
                    } else {
                        personality[1][1]++;
                    }
                }
                case 8 -> {
                    System.out.println("""
                                8.
                            A. Standard, usual, conventional.
                            B. Different, novel, unique.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[1][0]++;
                    } else {
                        personality[1][1]++;
                    }
                }
                case 9 -> {
                    System.out.println("""
                                9.
                            A. Focus on here-and-how.
                            B. look to the future, global perspective, "big picture".
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[1][0]++;
                    } else {
                        personality[1][1]++;
                    }
                }
                case 10 -> {
                    System.out.println("""
                                10.
                            A. Facts, things, "What is".
                            B. Ideas, dreams, "What could be," philosophical.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[1][0]++;
                    } else {
                        personality[1][1]++;
                    }
                }
                case 11 -> {
                    System.out.println("""
                                11.
                            A. Logical, thinking, questioning.
                            B. Empathetic, feeling, accommodating.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else {
                        personality[2][1]++;
                    }
                }
                case 12 -> {
                    System.out.println("""
                                12.
                            A. Candid, straightforward, frank.
                            B. Tactful, kind, encouraging.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else {
                        personality[2][1]++;
                    }
                }
                case 13 -> {
                    System.out.println("""
                                13.
                            A. Firm, tend to criticize, hold the line.
                            B. Gentle, tend to appreciate, conciliate.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else {
                        personality[2][1]++;
                    }
                }
                case 14 -> {
                    System.out.println("""
                                14.
                            A. Tough-minded, just.
                            B. Tender-hearted and merciful.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else {
                        personality[2][1]++;
                    }
                }
                case 15 -> {
                    System.out.println("""
                                15.
                            A. Matter of fact, issue-oriented.
                            B. Sensitive, people-oriented, compassionate .
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[2][0]++;
                    } else {
                        personality[2][1]++;
                    }
                }
                case 16 -> {
                    System.out.println("""
                                16.
                            A. Organized.
                            B. Flexible, adaptable.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[3][0]++;
                    } else {
                        personality[3][1]++;
                    }
                }
                case 17 -> {
                    System.out.println("""
                                17.
                            A. Plan, Schedule.
                            B. Unplanned, spontaneous.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[3][0]++;
                    } else {
                        personality[3][1]++;
                    }
                }
                case 18 -> {
                    System.out.println("""
                                18.
                            A. Regulated, structured.
                            B. Easygoing, "live" and "let live".
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[3][0]++;
                    } else {
                        personality[3][1]++;
                    }
                }
                case 19 -> {
                    System.out.println("""
                                19.
                            A. Preparation, plan ahead.
                            B. Go with the flow, adapt as you go.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[3][0]++;
                    } else {
                        personality[3][1]++;
                    }
                }
                case 20 -> {
                    System.out.println("""
                                20.
                            A. Control, govern.
                            B. Latitude, freedom.
                            """);
                    System.out.print("Answer: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("A")) {
                        personality[3][0]++;
                    } else {
                        personality[3][1]++;
                    }
                }

            }

        }

    }


    
    static void questionnaireAnswer(){
        System.out.printf("Number of A's for E/I: %d%n",personality[0][0]);
        System.out.printf("Number of B's for E/I: %d%n",personality[0][1]);
        System.out.printf("Number of A's for S/N: %d%n",personality[1][0]);
        System.out.printf("Number of B's for S/N: %d%n",personality[1][1]);
        System.out.printf("Number of A's for T/F: %d%n",personality[2][0]);
        System.out.printf("Number of B's for T/F: %d%n",personality[2][1]);
        System.out.printf("Number of A's for J/P: %d%n",personality[3][0]);
        System.out.printf("Number of B's for J/P: %d%n",personality[3][1]);

        System.out.println();

        System.out.println("Your Personality is: ");

        if(personality[0][0] > personality[0][1]){
            System.out.print("E");
        }
        else {
            System.out.print("I");
        }

        if(personality[1][0] > personality[1][1]){
            System.out.print("S");
        }
        else {
            System.out.print("N");
        }

        if(personality[2][0] > personality[2][1]){
            System.out.print("T");
        }
        else {
            System.out.print("F");
        }

        if(personality[3][0] > personality[3][1]){
            System.out.print("J");
        }
        else {
            System.out.print("P");
        }
    }
}
