package assignment5;

import java.text.DecimalFormat;

public class Driver {
    
	public static void main(String[] args) {
        
            
            
            
        Student student = new Student("Harry Potter");
        student.addAssignmentScore(98.5);
        student.addAssignmentScore(90.1);
        student.addAssignmentScore(78.3);
        student.addExamScore(95);
        student.addExamScore(87);

        DecimalFormat df = new DecimalFormat("0.0");
        // should use algorithm A by default:
        System.out.println(student.getName() + "  " +
                           df.format(student.getAverage()));

        // switch to algorithm B:
        // <<code to switch to B goes here>>
        System.out.println(student.getName() + "  " +
                           df.format(student.getAverage()));
        // switch back to algorithm A here:
        // <<code to switch to A goes here>>
        
        //test the GradeTracker
        GradeTracker gt = new GradeTracker(student);
        System.out.println("letter grade: " + gt.getLetterGrade());
        student.addExamScore(33);
        System.out.println("Added an exam score.");
        System.out.println("letter grade: " + gt.getLetterGrade());
        
        //add a new student
        Student hg = new Student("Hermione Granger");
        hg.addAssignmentScore(96.2);
        hg.addAssignmentScore(98.1);
        hg.addAssignmentScore(99.3);
        hg.addExamScore(95);
        hg.addExamScore(97);
        
        //make a roster
        Roster potions = new Roster("Potions","MAG2308");
        potions.addStudent(student);
        potions.addStudent(hg);
        
        //test the roster traversal
        System.out.println("Potions grades:");
        // <<code to set up traversal goes here>>
        while (false /* replace with <<condition>> */) {
            Double nextAvg = 0.0/* replace with <<another value>> */;
            System.out.println("next average "  +
                               df.format(nextAvg.doubleValue()));
        }

    }
}