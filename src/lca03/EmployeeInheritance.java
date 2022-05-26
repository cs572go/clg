package lca03;
import java.util.*;

/*
Write a JAVA program with heirarchical inheritance with base class employee
derived classes fulltimeemployee and internemployee
methods display salary in base class
calculate salary in derived classes
fulltime - 50% hike
intern - 25% hike

Display before and after hike
 */

class Employee{
    int salary,baseSalary, empId;
    public String name;
    static int count;
    Scanner scE = new Scanner(System.in);
    Employee(){
        this.baseSalary=0;
        this.salary=this.baseSalary;
        this.name="NULL";
        this.empId=setEmpID();
    }

    int setEmpID(){
        return ++count;
    }

    void displaySalary(){
        System.out.println("Salary : "+this.baseSalary);
    }

    void displayHikeSalary(){
        System.out.println("Salary after hike :"+this.salary);
    }

    void acceptData(){
        System.out.println("Enter Name : ");
        this.name=scE.nextLine();
        System.out.println("Enter Base Salary :");
        this.baseSalary=scE.nextInt();
        this.salary=this.baseSalary;
    }

    void displayData(){
        System.out.println("Name : "+this.name);
        System.out.println("Employee ID : "+this.empId);
    }
}

class FullTimeEmployee extends Employee{
    FullTimeEmployee(){
        super();
    }
    void calculateSalary(){
        this.salary+=(0.5)*this.salary;
    }
}

class InternEmployee extends Employee{
    InternEmployee(){
        super();
    }
    void calculateSalary(){
        this.salary+=(0.25)*this.salary;
    }
}

public class EmployeeInheritance {
    public static void main(String ...args){
        int noOfFull, noOfInterns, choice=-1, choice2=-1, type=-1, id;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Fulltime Employees : ");
        noOfFull = sc.nextInt();

        System.out.println("Enter number of Intern Employees : ");
        noOfInterns = sc.nextInt();

        System.out.flush();


        FullTimeEmployee[] ftE = new FullTimeEmployee[noOfFull];
        for(int i=0;i<noOfFull;i++){
            ftE[i] = new FullTimeEmployee();
//            ftE[i].displaySalary();
//            ftE[i].calculateSalary();
//            ftE[i].displayHikeSalary();
        }

        InternEmployee[] itE = new InternEmployee[noOfInterns];
        for(int i=0;i<noOfInterns;i++){
            itE[i] = new InternEmployee();
//            itE[i].displaySalary();
//            itE[i].calculateSalary();
//            itE[i].displayHikeSalary();
        }

        do {
            System.out.println("----Employee Database----");
            System.out.println("Enter employee type");
            System.out.println("1. FullTime");
            System.out.println("2. Intern");
            System.out.println("0. Exit");
            choice=sc.nextInt();
            System.out.flush();
            switch(choice){
                case 1:
                    System.out.println("----FullTime Employee----");
                    System.out.println("1. Accept Data");
                    System.out.println("2. Display Data");
                    System.out.println("0. Back");
                    choice2=sc.nextInt();
                    switch(choice2){
                        case 1:
                            System.out.println("Enter employee id : ");
                            id=sc.nextInt()-1;
                            ftE[id].acceptData();
                            ftE[id].calculateSalary();
                            break;
                        case 2:
                            System.out.println("Enter employee id : ");
                            id=sc.nextInt()-1;
                            ftE[id].displayData();
                            ftE[id].displaySalary();
                            ftE[id].displayHikeSalary();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("----Intern Employee----");
                    System.out.println("1. Accept Data");
                    System.out.println("2. Display Data");
                    System.out.println("0. Back");
                    choice2=sc.nextInt();
                    switch(choice2){
                        case 1:
                            System.out.println("Enter employee id : ");
                            id=sc.nextInt()-1;
                            itE[id].acceptData();
                            itE[id].calculateSalary();
                            break;
                        case 2:
                            System.out.println("Enter employee id : ");
                            id=sc.nextInt()-1;
                            itE[id].displayData();
                            itE[id].displaySalary();
                            itE[id].displayHikeSalary();
                            break;
                        default:
                            break;
                    }
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
