import java.lang.*;

import java.util.*;

class sum extends Thread {

    int i, j;

    sum(int x, int y) {

        i = x;

        j = y;

    }

    public void run() {
        System.out.println(" Sum " + (i + j));
    }

}

class difference extends Thread {

    int i, j;

    difference(int x, int y) {

        i = x;

        j = y;

    }

    public void run() {


        System.out.println(" Difference " + (i - j));

    }

}

class mul extends Thread {

    int i, j;

    mul(int x, int y) {

        i = x;

        j = y;

    }

    public void run() {


        System.out.println(" Product  " + (i * j));


    }

}

class div extends Thread {

    int i, j;

    div(int x, int y) {

        i = x;

        j = y;

    }

    public void run() {
        double f=(double)i/j;
        System.out.printf(" Division  %f\n", f);

    }

}


class calc {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter two numbers");

        int x = s.nextInt();

        int y = s.nextInt();


        sum a = new sum(x, y);
        difference b = new difference(x, y);
        mul c = new mul(x, y);
        div d = new div(x, y);


        a.start();
        b.start();
        c.start();
        d.start();

    }

}