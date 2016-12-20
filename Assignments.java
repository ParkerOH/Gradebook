/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.*;
import java.lang.*;
/**
 *
 * @author Parker O'Heeron
 */
public class Assignments implements Strategy {

    private ArrayList<Double> cAssignments;
    private ArrayList<Double> cExams;

    /**
     *
     * @param assignments
     */
    public Assignments(ArrayList<Double> assignments, ArrayList<Double> exams)
    {
        cAssignments = assignments;
        cExams = exams;
    }
    /**
     *
     * @param s
     */
//    public void dropLow(ArrayList<double> s)
//    {
////        for(Student a: s)
////        {
////            
////        }
//    }

    /**
     *
     * @param lowIndex
     * @return
     */
    
    public double getAverage(ArrayList<Double> a, ArrayList<Double> e);
    {
        int lowIndex;
          if(cAssignments.size() >= 2){
              cAssignments.remove(lowIndex);
          }
    }
}
