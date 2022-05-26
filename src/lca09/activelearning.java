package lca09;

import java.util.Vector;
import java.util.Scanner;
import java.util.Arrays;

public class activelearning {
    public static void main(String[]args) {

        //scanner for input
        Scanner sc = new Scanner(System.in);

        //vector creation
        Vector<String> names= new Vector<>();

        //Adding Elements
        names.add("Tushar");
        names.add("Hrishikesh");
        names.add("Atharva");
        names.add("Ashutosh");

        //Display vector
        System.out.println("Vector:" +names);

        //Adding element to specific position
        names.add(1,"Name2");

        //Display vector
        System.out.println("Vector:" +names);

        //Search element in vector
        System.out.println("Enter name to search");
        String search_var = sc.nextLine();

        //Display search result
        if(names.contains(search_var)) {
            System.out.println(search_var + " found");
        }
        else {
            System.out.println(search_var + " not found");
        }

        //Copy vector
        Vector<String> copy=new Vector<>(names);
        //Display copy vector
        System.out.println("Copy vector:" +copy);

        //Vector to array
        String arr[] = names.toArray(new String[names.size()]);
        //Display array
        System.out.println("Array, string:" +Arrays.toString(arr));

        //Vector to string
        String str = names.toString();
        //Display string
        System.out.println("String:" +str);

        //Remove an element
        //by content
        names.remove("Name2");
        //Display vector
        System.out.println("Vector:" +names);

        //by index
        names.remove(2);
        //Display vector
        System.out.println("Vector:" +names);

    }
}