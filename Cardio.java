public class Cardio extends Workout{

    private int numMiles;
    private int pace;

    public Cardio(String exercise, int length, int numMiles, int pace){
        super(exercise, length);
        this.numMiles = numMiles;
        this.pace = pace;
    }

    public int getNumMiles(){
        return numMiles;
    }

    public int getPace(){
        return pace;
    }

    public void setNumMiles(int numMiles){
        this.numMiles = numMiles;
    }

    public void setPace(int pace){
        this.pace = pace;
    }

    //Concatenates parent "Workout" class with overridden toString
    @Override
    public String toString(){
        return super.toString() + " You ran for " + this.numMiles + " miles with a pace of " + this.pace + " minutes/mile.";
    }
    
}
