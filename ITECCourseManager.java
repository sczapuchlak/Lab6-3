package com.stephanie;
import java.util.ArrayList;

public class ITECCourseManager {

    ArrayList<ITECCourse> ITECCourseList = new ArrayList();

    public static void main(String[] args) {
	ITECCourse maintenanceCourse = new ITECCourse("MicroComputers",1310,20,"L15");
        //add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Paco");

        //maintenanceCourse.writeCourseInfo();

        System.out.println("Course name is  " + maintenanceCourse.getName());
        System.out.println("Course code is  " + maintenanceCourse.getCode());



        ITECCourse datacomCourse = new ITECCourse("DataComm",1425,34,null);

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Jamal");
        datacomCourse.addStudent("Reese");

        datacomCourse.writeCourseInfo();

    ITECCourse javaProgramming = new ITECCourse("Java",2545,24,null);
        javaProgramming.addStudent("Stephanie");
        javaProgramming.addStudent("Annuke");
        javaProgramming.addStudent("Christopher");

        javaProgramming.writeCourseInfo();
        //remove Christopher
        javaProgramming.removeStudent("Christopher");
        javaProgramming.writeCourseInfo();

    ITECCourse smallCourse =new ITECCourse("Made up class",1234,3,"G711");
        smallCourse.addStudent("John Cena");
        smallCourse.addStudent("Pablo");
        smallCourse.addStudent("Mark");
        smallCourse.addStudent("Jimmy John");
        smallCourse.writeCourseInfo();

    ITECCourse infoTechConcepts = new ITECCourse("Info Tech Concepts",1100,30,"T3050");
        infoTechConcepts.addStudent("Max");
        infoTechConcepts.addStudent("Nancy");
        infoTechConcepts.addStudent("Orson");
        infoTechConcepts.writeCourseInfo();
    }
}
