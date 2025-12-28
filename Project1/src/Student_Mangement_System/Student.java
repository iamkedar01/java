package Student_Mangement_System;

/*
Created by Kedar on 18/07/2025
This class is responsible for keeping the
track of students Details like name, id, fees,Grade
 */
public class Student {
    private int id ;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;




    /**  To get like this enter the /**
     * Details about the student
     *Fees for every student is 50000
     * fees paid initially is 0
     *
     * @param id id must be unique
     * @param name name of the student it may be same
     * @param grade grade of student based on the marks
     */
    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=50000; // better initialize all the variable in class
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    // Not going to alter students name , student id thats why not crete a method

    /**
     * used to update the student grades
     * @param grade new grade of student
     */
    public void setGrade(int grade){
        this.grade=grade;

    }
    public void setFeesPaid(int feesPaid){
        this.feesPaid=feesPaid;
    }




















}
