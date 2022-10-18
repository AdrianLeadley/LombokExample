package com.example.LombokExample.Demo1;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class StudentWithLombok {

    private Integer studentId;
    private String studentName;
    private String studentClass;
    private String studentEmailAddress;
    private boolean studentPassed;
    private float studentMark;

    public static void main(String []args){
        StudentWithLombok student1 = new StudentWithLombok(1,"Annop", "kg", "3@gmail", true, 1.01f);
        StudentWithLombok student2 = new StudentWithLombok();

        student2.setStudentId(2);
        student2.setStudentClass("science");
        student2.setStudentName("Adrian");
        student2.setStudentMark(5.00f);
        student2.setStudentPassed(true);
        student2.setStudentEmailAddress("adrian@gmail");

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        System.out.println("Student 2 id = " + student2.getStudentId());
        System.out.println(student2.isStudentPassed());

    }
}
