package lca07;
import java.util.*;

class even extends Thread{
    int n;
    even(int n){
        this.n=n;
    }
    public void run() {
        System.out.println("Even nos: ");
        for(int i = 0; i<=n; i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
class odd extends Thread{
    int n;
    odd(int n){
        this.n=n;
    }
    public void run() {
        System.out.println("Odd nos: ");
        for(int i = 1; i<=n; i++)
        {
            if(i%2 != 0)
            {
                System.out.println(i);
            }
        }

    }
}

public class threadprint {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n");
        n = sc.nextInt();
        even e = new even(n);
        odd o= new odd(n);
        e.start();
        o.start();
    }
}