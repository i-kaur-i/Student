
/**
 * This assignment is about creating a student class to make a student and allow it to enter and update assignment scores
 * This assignment also has a driver to run the student class.
 * @Iakjot 
 * @May12th (a version number or a date)
 */
public class Student
{
    private String name;
    private double scores [];
    // creating a student that takes in a name and number of assingments
    // looped through the loop and set values to -1
    public Student(String name, int maxAssign){
        this.name = name;
        this.scores = new double[maxAssign];

        for( int i=0; i < maxAssign; i++){
            scores[i] = -1; 
        }

    }
    // getting the name 
    public String getName(){
        return this.name;  

    }
    // setting the name
    private void setName(String theName){
        this.name = theName;
    }
    // allowing user to report a new score, has to be between 0 and 100
    // goes through the array and checks if an element is -1 and replaces it with the new score
    public boolean reportScore(double newScore){
        if( newScore >= 0 && newScore <= 100){
            for( int i=0; i < scores.length; i++){
                if( scores[i] == -1 ){
                    scores[i] = newScore;
                    return true; 
                }
            } 
            return false;
        }
        else{
            return false;
        }
    }
    // allowing the user to view the scores and if the score is -1 (not entered), then gives a message
    //if the score is entered already, then it goes through the array and prints the score that already exists 
    public void viewScores(){
        if( scores[0] == -1){
            System.out.println("Score has not been entered.");
        }
        else{
            for(int i=0; i < scores.length; i++){
                if( scores[i] > -1 ){
                    System.out.println("Score " + (i+1) + ": " + scores[i]);
                }
                else{
                    System.out.println("Score " + (i+1) + ": Not available."); 
                }
            }
        }
    }
    // allowing the student to update the assingment
    // if the user wants to update a score that doesn't exist, an error message is reported
    // a new score is reported if it does exist 
    // gave an error message if assignment score is out of bounds 
    public void updateAssign( int update, double scoreNew){
        if( scoreNew >= 0 && scoreNew <= 100 && update > 0 && update <= scores.length){
            if (scores[update-1] == -1) {
                System.out.println("Error! Score " + update + " has never been reported.");
            }
            scores[update-1] = scoreNew;
        }
        else {
            System.out.println("Error! Assignment score has to be between 0 and 100 or assignment number has to be greater than or equal to 1 and less than maxmium assignments."); 

        }

    }
}
