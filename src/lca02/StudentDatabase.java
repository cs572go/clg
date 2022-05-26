package lca02;

import java.util.*;

//Write a Java Program to take information for students like Name, RollNo,
//Marks for five subjects.
//Find the average marks(or percentage) and display his Grade A,B or C.
//Make use of the concepts for classes , methods ,access specifier and construct
public class StudentDatabase {
    public static void main(String[] args) {
        int noOfStudents, choice=-1, roll;
        Scanner sc = new Scanner(System.in);

//        Student s1 = new Student();
//        s1.acceptData();
//        s1.displayData();

        System.out.println("Enter total number of students : ");
        noOfStudents = sc.nextInt();

        Student[] students = new Student[noOfStudents];
        for(int i=0;i<noOfStudents;i++){
            students[i] = new Student();
        }

        do {
            System.out.println("----Student Database----");
            System.out.println("1. Accept Data");
            System.out.println("2. Display Data");
            System.out.println("0. Exit");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter serial no : ");
                    roll=sc.nextInt();
                    students[roll].acceptData();
                    break;
                case 2:
                    System.out.println("Enter serial no :");
                    roll=sc.nextInt();
                    students[roll].displayData();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        while(choice!=0);
    }
}

class Student {
    public int rollNo, avgMarks, marks[];
    public String name;
    char grade;
    static int count;

    Scanner sc=new Scanner(System.in);

    public Student(){
        this.rollNo=setRollNo();
        this.avgMarks=0;
        this.name="NULL";
        this.marks = new int[] {0,0,0,0,0};
        this.grade= 'X';
    }

    public void acceptData(){
        System.out.println("Enter Name");
        this.name=sc.nextLine();
        this.rollNo=setRollNo();
        for (int i=0;i<5;i++)
        {
            System.out.println("Enter Subject "+(i+1)+" marks :");
            this.marks[i]=sc.nextInt();
            avgMarks+=marks[i];
        }
        this.avgMarks/=5;
        this.grade=setGrade();
    }

    public void displayData(){

        System.out.println("--Student details--");
        System.out.println("Name : "+this.name);
        System.out.println("Roll no : "+this.rollNo);
        System.out.println("Subject marks :");
        for (int i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Average marks : " +this.avgMarks);
        System.out.println("Grade : " +this.grade);

    }

    char setGrade(){
        if(this.avgMarks>=80){
            return 'A';
        }
        else if(this.avgMarks>=50){
            return 'B';
        }
        else{
            return 'C';
        }
    }

    public int setRollNo(){
        return count++;
    }
}

