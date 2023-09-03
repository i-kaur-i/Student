
/**
 * This is a driver for the Student class and it checks if the Student class works
 *
 * @Iakjot (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String args[]){
     // positve testing 
     Student theStudent = new Student("Tommy",5); 
     theStudent.reportScore(50);
     theStudent.reportScore(80);
     theStudent.reportScore(90);
     theStudent.viewScores();
     theStudent.updateAssign(2,20);
     theStudent.reportScore(30);
     theStudent.reportScore(45);
     theStudent.viewScores();
     theStudent.updateAssign(3,80);
     theStudent.viewScores();
     
     System.out.println(theStudent.getName());
     
     // negative testing
     Student theStudent2 = new Student ("Jerry" , 2);
     theStudent2.viewScores();
     theStudent2.reportScore(-2);
     theStudent2.reportScore(50);
     
     theStudent2.updateAssign(2,80);
     
     // boundary testing
     Student theStudent3 = new Student("Sarah", 2);
     theStudent3.reportScore(100);
     theStudent3.reportScore(0);
     theStudent3.viewScores();
     
     
     
     
     
     
     
    }  
}
