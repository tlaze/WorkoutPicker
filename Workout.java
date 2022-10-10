import java.util.ArrayList;

public class Workout {

    private String exercise;
    private int length;

    public Workout(String exercise, int length){
        this.exercise = exercise;
        this.length = length;
    }

    //GETTER and Setters
    public String getExercise(){
        return exercise;
    }

    public void setExercises(String exercise){
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
        return "You completed: " + this.exercise + " for a duration of " + this.length + " minutes.";
    }
}
