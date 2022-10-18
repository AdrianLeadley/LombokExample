package com.example.LombokExample.Demo1;

public class Student {


    private Integer studentId;
    private String studentName;
    private String studentClass;
    private String studentEmailAddress;
    private boolean studentPassed;
    private float studentMark;

    ///////////////////////  default constructor ///////////////////////////////////
    public Student(){
    }


    ///////////////////////////////////// parametrised Student /////////////////
    public Student (Integer studentId, String studentName, String studentClass,
                    String studentEmailAddress, Boolean studentPassed, float studentMark){

        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass= studentClass;
        this.studentEmailAddress = studentEmailAddress;
        this.studentPassed = studentPassed;
        this.studentMark = studentMark;

    }

     ///////////////////////////////// Getter and Setter ///////////////////////////////////////////

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentEmailAddress() {
        return studentEmailAddress;
    }

    public void setStudentEmailAddress(String studentEmailAddress) {
        this.studentEmailAddress = studentEmailAddress;
    }

    public boolean isStudentPassed() {
        return studentPassed;
    }

    public void setStudentPassed(boolean studentPassed) {
        this.studentPassed = studentPassed;
    }

    public float getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(float studentMark) {
        this.studentMark = studentMark;
    }

    @Override
    public String toString(){
        return "Student [StudentId = " + studentId + " StudentName = " + studentName + " StudentClass = " + studentClass +
                " StudentEmail = " + studentEmailAddress + " StudentPassed = " + studentPassed + " StudentMark = " + studentMark + " ]";
    }

    public static void main(String[] args){
        // creating an object of class type - student //
        Student student1 = new Student(1,"Annop", "kg", "3@gmail", true, 1.01f);
        Student student2 = new Student(2,"Sid", "Nurse", "233@gmail", false, 14.01f);

        System.out.println(student1.toString());
    }






}
