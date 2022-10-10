import java.util.*;

public class Main{

    public static void main(String[] args){

        ArrayList<String> exercise = new ArrayList<>(); //creates list of exercises user chooses

        
        exercise.add("Bench Press");    //debugging exercises
        exercise.add("Squat");

        String userAnswer = "Squat";    //debugging user choice       

        String work = "";    //Initialized String to add user's answer to

        // Loops through exersize ArrayList. If userAnswer equals an item it
        // adds to example String
        for( String s : exercise){
            if(userAnswer.equals(s)){
                work += s;
            }
        }
        System.out.println(work);    //confirmation for loop works

        Workout gym = new Workout(work, 2); //Creates new Workout object
        System.out.println(gym);

        WeightLifting lift = new WeightLifting(work, 30, 5, 10); //Creates a Weightlifting object with overridden toString method
        System.out.println(lift);

        Cardio run = new Cardio(work, 60, 2, 10);   //debug for cardio class
        System.out.println(run);

    }
}