import java.util.*;

public class Main{

    public static void main(String[] args){

        ArrayList<String> exercise = new ArrayList<>(); //creates list of exercises user chooses

        
        exercise.add("Bench Press");    //debugging exercises
        exercise.add("Squat");

        String userAnswer = "Squat";    //debugging user choice       

        String example = "";    //Initialized String to add user's answer to

        // Loops through exersize ArrayList. If userAnswer equals an item it
        // adds to example String
        for( String s : exercise){
            if(userAnswer.equals(s)){
                example += s;
            }
        }
        System.out.println(example);    //confirmation for loop works

        Workout poop = new Workout(example, 2); //Creates new Workout object
        System.out.println(poop);

    }
}