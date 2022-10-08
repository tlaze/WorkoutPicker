public class Exercise {

    private String exercise;
    private int length;

    public Exercise(String exercise, int length){
        this.exercise = exercise;
        this.length = length;
    }

    //GETTER and Setters
    public String getExercise(){
        return exercise;
    }

    public void setExercise(String exercise){
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
