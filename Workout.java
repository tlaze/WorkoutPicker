import java.util.ArrayList;

public class Workout {

    private ArrayList<Workout> exercise;
    private int length;

    public Workout(ArrayList<Workout> exercise, int length){
        this.exercise = exercise;
        this.length = length;
    }

    //GETTER and Setters
    public ArrayList<Workout> getExercise(){
        return exercise;
    }

    public void setExercises(ArrayList<Workout> exercise){
        this.exercise = exercise;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override
    public String toString(){
        return "You chose to do: " + this.exercise + " for a duration of " + this.length + " minutes.";
    }
}
