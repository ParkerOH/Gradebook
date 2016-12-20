package assignment5;

import java.util.*;

/**
 * 
 * @author kkelldorf
 */


//public abstract class Observer {
//    protected Student s;
//    public abstract char getLetterGrade();
//}

public class GradeTracker implements Observer {
    
    public GradeTracker(Student s) {
        s.addObserver(this);
        String name = s.getName();
    }
    
    @Override
    public char getLetterGrade(Observable obj, Object arg) {
        Student s = (Student)obj;
        double avg = s.getAverage();
        
        if(avg < 60)
            return 'F';
        else if(avg < 70 && avg > 60)
            return 'D';
        else if(avg < 80 && avg > 70)
            return 'C';
        else if(avg < 90 && avg > 80)
            return 'B';
        else if(avg < 100 && avg > 90)
            return 'A';
        else 
            System.out.println("something is wrong");
            return 0;
    }

    @Override
    public char getLetterGrade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}