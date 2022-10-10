import java.util.*;

public class Main{

    public static void main(String[] args){

        ArrayList<String> exercise = new ArrayList<>(); //creates list of exercises user chooses

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to lift weights or do cardio? ('W' for weights or 'C' for cardio");
        String choice = sc.nextLine();
        System.out.println("user picked: " + choice.toUpperCase());
        
        String workoutChoice = choice.toUpperCase();    //Changes user's answer to uppercase
        
        switch(workoutChoice){
            case "W":

                //Scanner asks user questions and stores answers in variables to
                //pass throught methods
                System.out.println("What exercise did you pick?");
                String exerciseChoice = sc.nextLine();

                System.out.println("How many minutes did you perform " + exerciseChoice + "?");
                int exerciseLength = sc.nextInt();

                System.out.println("How many Sets did you perform?");
                int sets = sc.nextInt();

                System.out.println("How many reps did you perform in each set?");
                int reps = sc.nextInt();

                exercise.add(exerciseChoice);
                String work = "";    //Initialized String to add user's answer to

                // Loops through exercise ArrayList. If userAnswer equals an
                // item in the list then it
                // adds to the String
                for( String s : exercise){
                    if(exerciseChoice.equals(s)){
                        work += s;
                    }
                }

                WeightLifting lift = new WeightLifting(work, exerciseLength, sets, reps); //Creates a Weightlifting object with overridden toString method
                System.out.println(lift);

                break;
            case "C":
                
                System.out.println("How many minutes did you run for?");
                int cardioLength = sc.nextInt();

                System.out.println("How many miles did you run?");
                int miles = sc.nextInt();

                System.out.println("What was your average pace? 'x' minutes/mile");
                int pace = sc.nextInt();

                Cardio run = new Cardio("Cardio", cardioLength, miles, pace);
                System.out.println(run);

                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}