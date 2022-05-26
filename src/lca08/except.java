package lca08;
import java.util.*;

public class except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            String num1, num2;
            System.out.println("Enter n1: ");
            num1 = sc.nextLine();
            int n1 =  Integer.parseInt(num1);
            System.out.println("Enter n2: ");
            num2 = sc.nextLine();
            int n2 = Integer.parseInt(num2);
            int n3 = n1/n2;
            System.out.println(n3);
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception-> " + e);
        }
        catch(NumberFormatException e)
        {
            System.out.println("exception-> " + e);
        }
        finally
        {
            System.out.println("Executed 'try-catch'");
        }

        try
        {
            int arr[] = new int[5];
            for(int i = 0; i<5; i++)
            {
                arr[i] = 5;
            }
            int ind;
            System.out.println("Enter index");
            ind = sc.nextInt();
            System.out.println("Array: " + arr[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("exception-> " + e);
        }
        finally
        {
            System.out.println("Executed 'try-catch'");
        }


    }

}