package assignment5;

import java.util.*;
import java.lang.*;

/**
 * Represents a student and their scores in a class.
 * Stores the name, assignment scores and exam scores.
 * @author Jill Seaman
 *
 */
public class Student extends Observable {

    private String name;                    // Students full name
    private ArrayList<Double> assignments;  // scores for the assignments
    private ArrayList<Double> exams;        // scores for the exams
    //private ArrayList<GradeTracker> grades;
    private Strategy strategy;
    //private int state;
    
	/**
	 * Constructs the student from their name
	 * @param name  full name of the student.
     * @param strategy
	 */
	public Student(String name) {
        this.name = name;
        this.assignments = new ArrayList<>();
        this.exams = new ArrayList<>();
        this.strategy= strategy;
	}


	/**
	 * @return the student's full name
	 */
	public String getName() {
		return name;
	}
    
    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }
    
	/**
	 * Adds an assignment score to the collection of assignment scores for the student.
	 * @param as the assignment score to add
	 */
	public void addAssignmentScore (double as) {
		assignments.add(as);
	}

	/**
	 * Adds an exam score to the collection of exam scores for the student.
	 * @param es the exam score to add
	 */
	public void addExamScore (double es) {
		exams.add(es);
	}
  	   
	/**
	 * @return the average for the student
	 */
//	public double getAverage() {
//        
//        // implement me!
//        return strategy.getAverage(assignments, exams);
//	}
    
    public double getAverage() {
        
        double aTotal = 0, eTotal = 0;
        
        for (int i = 0; i < this.assignments.size(); i++)
            aTotal = aTotal + this.assignments.get(i);
        for (int i = 0; i < this.exams.size(); i++)
            eTotal = eTotal + this.exams.get(i);
        
        double low = 100;
       
            for (int i = 0; i < this.assignments.size(); i++)
                if(this.assignments.get(i) < low)
                    low = this.assignments.get(i);
            
       
            
                
        double aAvg = 0, eAvg = 0, minusLowestAvg = 0;
        aAvg = aTotal / this.assignments.size();
        eAvg = eTotal / this.exams.size();
        minusLowestAvg = (aTotal - low) / this.assignments.size();
       
        
        
        return strategy.getAverage(this.assignments, this.exams);
    }

}