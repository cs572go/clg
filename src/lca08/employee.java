package lca08;
import java.util.*;
import java.lang.*;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str);
    }
}

class NameNotValidException extends Exception
{
    public NameNotValidException(String str)
    {
        super(str);
    }
}

class emp
{
    int eid, age;
    String name, dept;

    emp(String n,String d,int a, int e)
    {
        eid = e;
        age = a;
        name = n;
        dept = d;
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Eid: " + eid);
        System.out.println("Age: " + age);
        System.out.println("Dept: " + dept);
    }

}
public class employee {
    static void validate(int age) throws InvalidAgeException
    {
        if(age<25 || age>60)
        {
            throw new InvalidAgeException("Enter valid age");
        }
        else
        {
            System.out.println("Continue...");
        }
    }

    static void nameval(String name) throws NameNotValidException
    {
        char ch;
        for(int i=0; i<name.length(); i++)
        {
            ch = name.charAt(i);
            if(ch < 'A' || ch > 'Z' && ch <'a' || ch > 'z')
            {
                throw new NameNotValidException("Enter valid name");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 1;
        int eid, age=0;
        String name = null, dept;
        while(choice == 1)
        {
            try
            {
                System.out.println("Enter name");
                name = sc.nextLine();
                nameval(name);
            }
            catch(NameNotValidException e)
            {
                System.out.println("Exception: " + e);
            }

            System.out.println("Enter dept");
            dept = sc.nextLine();

            try
            {
                System.out.println("Enter age");
                age = sc.nextInt();
                validate(age);
            }
            catch(InvalidAgeException e)
            {
                System.out.println("Exception: " + e);
            }

            System.out.println("Enter eid: ");
            eid = sc.nextInt();

            emp em = new emp(name, dept, age, eid);
            em.display();

            System.out.println("Enter 1 to continue: ");
            choice = sc.nextInt();
            sc.nextLine();
        }
    }

}