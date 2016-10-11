package com.stephanie;

import java.util.ArrayList;

/**Stores data about an ITEC course*/

public class ITECCourse {
//data that an ITEC course object needs to store
    private String name;
    private int code;
    private ArrayList<String>students;
    private int maxStudents;
    private String room;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    //Constructor
    public ITECCourse(String courseName, int CourseCode, int CourseMaxStudents,
                      String roomNumber){
        this.name = courseName;
        this.code= CourseCode;
        this.students = new ArrayList<String>();//sets up student list
        this.maxStudents = CourseMaxStudents;
        this.room = roomNumber;
    }

    public void addStudent(String studentName){
        if (students.size()==maxStudents)

    {
        System.out.println("Course is full! I can't add " + studentName);
    }else{
        students.add(studentName);
    }}

   public void removeStudent(String studentName){
        if (students.contains(studentName)){
        students.remove(studentName);
        System.out.println(studentName + "was un-enrolled from " + this.name);
    }else{
        System.out.println(studentName +"was not found in "+this.name);
    }

    }

    void writeCourseInfo(){
        ArrayList courseInformation = new ArrayList();
        courseInformation.add(0,getName());
        courseInformation.add(1,getCode());
        courseInformation.add(2,getMaxStudents());
        courseInformation.add(3,getRoom());
        System.out.println(courseInformation);
    }

    int getNumberOfStudents() {
        return this.students.size();
    }

    int freeSpaces () {
        int spaces = (getMaxStudents() - getNumberOfStudents());
        return spaces;}

}
