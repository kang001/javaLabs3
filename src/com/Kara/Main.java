package com.Kara;


import java.util.Scanner;

public class Main {
    private static Scanner numberScanner = new Scanner(System.in);
    private static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Is it Agile or Waterfall?");

        System.out.println("How many programmers will be on the team?");
        int numberOfProgrammers = numberScanner.nextInt();
        int agileProgrammers = 5; //large teams are not good for agile

        //all of the answers to these questions should be yes/no, true/false answers
        System.out.println("Are there going to be firm deadlines and a fixed schedule?");
        String firmSchedule = stringScanner.nextLine();

        System.out.println("Do the programmers have experience in requirements," +
                "analysis and testing as well as coding?");
        String programmerExperience = stringScanner.nextLine();

        System.out.println("Are there stringent quality control requirements?");
        String controlRequirements = stringScanner.nextLine();

        System.out.println("Is early integration desirable?");
        String earlyIntegration = stringScanner.nextLine();

        System.out.println("Will the customer require working models early " +
                "in the process?");
        String earlyModels = stringScanner.nextLine();


        //stores the return string from the method in a variable that the user can understand
        String methodLogic = calculateMethodLogic(agileProgrammers, firmSchedule,
                programmerExperience, controlRequirements, earlyIntegration, earlyModels);

        //prints out to user which development method they should use
        System.out.println("Your team should use the " + methodLogic + " methodology of development.");

    }

    // these are the arguments my method will accept
    private static String calculateMethodLogic(int numberOfProgrammers,
                                                String firmSchedule,
                                                String programmerExperience,
                                                String controlRequirements,
                                                String earlyIntegration,
                                                String earlyModels)
    {
        if (numberOfProgrammers > 5
                && firmSchedule.equalsIgnoreCase("yes")
                && programmerExperience.equalsIgnoreCase("yes")
                && controlRequirements.equalsIgnoreCase("yes")
                && earlyIntegration.equalsIgnoreCase("no")
                && earlyModels.equalsIgnoreCase("no")){
            return "waterfall"; // I don't know why it still returns  agile even if I input all these variables correctly
        }
        else { //if the user inputs anything incorrectly, then the program should just return waterfall
            return "agile";
        }


    }



}

