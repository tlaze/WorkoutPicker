public class WeightLifting extends Workout{

    private int numSets;
    private int numReps;

    public WeightLifting (String exercise, int length, int numSets, int numReps){
        super(exercise, length);
        this.numSets = numSets;
        this.numReps = numReps;
    }

    public int getNumSets(){
        return numSets;
    }

    public int getNumReps(){
        return numReps;
    }

    public void setNumSets(int numSets){
        this.numSets = numSets;
    }

    public void setNumReps(int numReps){
        this.numReps = numReps;
    }

    //Concatenates parent "Workout" class with overridden toString
    @Override
    public String toString(){
        return super.toString() + " Number of Sets: " + this.numSets + " Number of Reps: " + this.numReps;
    }
    
}
